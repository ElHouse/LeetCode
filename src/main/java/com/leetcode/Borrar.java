package com.leetcode;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Borrar {


    public static void main(String[] args) throws ExecutionException, InterruptedException {




        class Empleado {
            String nombre, departamento;
            Integer salario, edad;

            public Empleado(String nombre, String departamento, Integer salario) {
                this.nombre = nombre;
                this.departamento = departamento;
                this.salario = salario;
                this.edad = new Random().nextInt(9) + 18;
            }

            @Override
            public String toString() {
                return "Empleado{" +
                        "nombre='" + nombre + '\'' +
                        ", departamento='" + departamento + '\'' +
                        ", salario=" + salario +
                        ", edad=" + edad +
                        '}';
            }
        }

        List<Empleado> empleados = Arrays.asList(
                new Empleado("Juan", "IT", 5000),
                new Empleado("Ana", "Recursos Humanos", 4500),
                new Empleado("Luis", "Finanzas", 6000),
                new Empleado("Sofia", "IT", 5200),
                new Empleado("Carlos", "Marketing", 4000),
                new Empleado("Lucia", "Finanzas", 6200),
                new Empleado("Pedro", "Logistica", 5000),
                new Empleado("Maria", "Recursos Humanos", 4600),
                new Empleado("Diego", "Marketing", 4100),
                new Empleado("Maria", "Ventas", 5000)
        );

        /*
                Map<Urgencia, List<TareaUrgente>> tareaUrgenteListMap = listaTareas
                .stream()
                .filter(t -> !t.isCompleted)
                .collect(Collectors.groupingBy(t -> t.urgencia,
                        Collectors.collectingAndThen(Collectors.toList(), list ->
                                list
                                        .stream()
                                        .sorted(Comparator.comparing(TareaUrgente::getTarea))
                                        .toList()
                        )));

         */


        Map<Boolean, Optional<Empleado>> empleadospORsALARIO = empleados.stream()
                .collect(Collectors.partitioningBy(
                        e -> e.salario > 5000,
                        Collectors.maxBy( Comparator.comparing(e->e.salario)))
                );


        Map<Boolean, List<Empleado>> empleadospORsALARIO2 = empleados.stream()
                .collect(Collectors.partitioningBy(
                        e -> e.salario > 5000,
                        Collectors.collectingAndThen(Collectors.toList(),
                                l->l.stream().sorted(Comparator.comparing(e->e.salario)).limit(1).toList())
                        )
                );

        Optional<Empleado> empleadosMax = empleadospORsALARIO.get(true).stream().max((e1, e2) -> e1.salario - e2.salario);
        Optional<Empleado> empleadosMax2 = empleadospORsALARIO.get(false).stream().max(Comparator.comparingInt(e -> e.salario));


        Map<String, Empleado> respuesta8 = empleados.stream()
                .collect(Collectors.toMap(
                        k -> k.departamento,
                        v -> v,
                        (a, b) -> (a.salario > b.salario) ? a : b
                ));

        System.out.println("respuesta8->" + respuesta8);


        Map<String, List<Empleado>> respuesta9 = empleados.stream()
                .collect(
                        Collectors.
                                groupingBy(
                                        k -> k.departamento
                                ));


        Map<String, Double> respuesta10 = empleados.stream()
                .collect(
                        Collectors.
                                groupingBy(
                                        k -> k.departamento,
                                        Collectors.averagingDouble(e -> e.salario)
                                ));


        Function<Integer, Integer> factoria = (n) -> n * n * 2;

        ExecutorService es = Executors.newFixedThreadPool(4);

        System.out.println(es.submit(() -> factoria.apply(1)).get());
        System.out.println(es.submit(() -> factoria.apply(2)).get());
        System.out.println(es.submit(() -> factoria.apply(3)).get());
        System.out.println(es.submit(() -> factoria.apply(4)).get());
        System.out.println(es.submit(() -> factoria.apply(5)).get());


        Function<Integer, Integer> multi3 = (n) -> n * 3;
        Function<Integer, Integer> suma5 = (n) -> n + 5;

        List<Empleado> empleados12 = empleados.stream().sorted((e1, e2) -> {

            if (e1.salario.equals(e2.salario)) {
                if (e1.edad.equals(e2.edad)) {
                    return e1.nombre.compareTo(e2.nombre);
                }
                return Integer.compare(e2.edad, e1.edad);
            }
            return Integer.compare(e2.salario, e1.salario);
        }).toList();


        Map<String, List<Integer>> ejercio13 = new HashMap<>();
        ejercio13.put("Electronics", Arrays.asList(1500, 2200, 3000));
        ejercio13.put("Clothing", Arrays.asList(500, 800));
        ejercio13.put("Groceries", Arrays.asList(100, 250, 400, 600));
        ejercio13.put("Furniture", Arrays.asList(5000, 7500));


        Map<String, Integer> respuesta15 = ejercio13.entrySet().stream()
                .collect(Collectors.toMap(k -> k.getKey(),
                        v -> v.getValue().stream().reduce(0,
                                (v1, v2) -> v1 + v2)));


        List<String> frases = Arrays.asList(
                "El conocimiento es poder.",
                "La práctica hace al maestro.",
                "El tiempo es oro.",
                "La paciencia es una virtud.",
                "Menos es más."
        );


        Set<String> resuesta16 = frases.stream()
                .flatMap(s -> Arrays.stream(s.split(" ")))
                .collect(Collectors.toSet());


        List<Integer> numeros = IntStream.range(0, 100000000)
                .map(i -> ThreadLocalRandom.current().nextInt(0, 99999))
                .boxed()
                .toList();


        long startTime = System.nanoTime();
        long sumaParalela = numeros.parallelStream().reduce(0, (a, b) -> a + b);
        long endTime = System.nanoTime(); // Captura el tiempo de finalización
        long duration = endTime - startTime;


        long startTime2 = System.nanoTime(); // Captura el tiempo de inicio
        long sumaNoParalea = numeros.stream().reduce(0, (a, b) -> a + b);
        long endTime2 = System.nanoTime(); // Captura el tiempo de finalización
        long duration2 = endTime2 - startTime2;

        ForkJoinPool pool = new ForkJoinPool(4);  // Se establece el número de hilos

        int sumaForkJoin = pool.submit(
                        () -> numeros.parallelStream()
                                .reduce(0, Integer::sum))
                .join();

        System.out.println("Suma con ForkJoinPool: " + sumaForkJoin);

        pool.shutdown();



        BiFunction<Empleado, Empleado, Empleado> merge = (e1, e2) -> new Empleado(e1.nombre.concat(e2.nombre), "join", e1.salario + e2.salario);
        BinaryOperator<Empleado> binaryOperator = (e1, e2) -> new Empleado(e1.nombre.concat(e2.nombre), "join", e1.salario + e2.salario);

        merge.apply(empleados12.get(0), empleados12.get(1));
        binaryOperator.apply(empleados12.get(0), empleados12.get(1));


        Map<Boolean, List<Empleado>> empleados_SALARIO = empleados12.stream().collect(Collectors.partitioningBy(e -> e.salario > 4999));


        List<TareaUrgente> listaTareas = new ArrayList<>();

        listaTareas.add(new TareaUrgente(Urgencia.HIGH, "Resolver problema crítico en producción", false));
        listaTareas.add(new TareaUrgente(Urgencia.MEDIUM, "Enviar informe mensual", true));
        listaTareas.add(new TareaUrgente(Urgencia.LOW, "Comprar café", true));
        listaTareas.add(new TareaUrgente(Urgencia.HIGH, "Preparar presentación", false));
        listaTareas.add(new TareaUrgente(Urgencia.MEDIUM, "Llamar al proveedor", false));
        listaTareas.add(new TareaUrgente(Urgencia.LOW, "Revisar correos importantes", true));
        listaTareas.add(new TareaUrgente(Urgencia.HIGH, "Actualizar documentación del proyecto", true));
        listaTareas.add(new TareaUrgente(Urgencia.MEDIUM, "Configurar nueva herramienta", true));
        listaTareas.add(new TareaUrgente(Urgencia.LOW, "Agendar reunión con el equipo", false));
        listaTareas.add(new TareaUrgente(Urgencia.HIGH, "Revisar reporte de auditoría", true));


        Map<Urgencia, List<TareaUrgente>> tareaUrgenteListMap = listaTareas
                .stream()
                .filter(t -> !t.isCompleted)
                .collect(Collectors.groupingBy(t -> t.urgencia,
                        Collectors.collectingAndThen(Collectors.toList(), list ->
                                list
                                        .stream()
                                        .sorted(Comparator.comparing(TareaUrgente::getTarea))
                                        .toList()
                        )));


        PriorityQueue<TareaUrgente> pr = new PriorityQueue<>((pr1, pr2) -> {
            return pr2.urgencia.level - pr1.urgencia.level;
        });

        pr.addAll(listaTareas);


        while (!pr.isEmpty()) {
            TareaUrgente aux = pr.poll();
            System.out.println(aux.tarea + ":" + aux.urgencia);

        }


        Map<String, List<Empleado>> mapDepEmpleados = empleados12.stream().collect(Collectors.groupingBy(e -> e.departamento));

        Map<String, Double> mapDelPromdio = mapDepEmpleados.entrySet()
                .stream()
                .collect(
                        Collectors.toMap(
                                k -> k.getKey(),
                                v -> v.getValue().stream().mapToDouble(j -> j.salario).average().getAsDouble()
                        ));


        int maxSalario = empleados.stream().mapToInt(e -> e.salario).reduce(0, (a, b) -> Math.max(a, b));
        int MaxSlario = empleados.stream().mapToInt(e -> e.salario).max().getAsInt();


        List<String> cadenas53 = Arrays.asList(
                "lambda", "java", "programacion", "cod", "Iackend",
                "api", "arquitectura", "analitica", "asynchronous", "async",
                "integracion", "inteligencia", "infraestructura", "interfaz", "Iterador",
                "Operaciones", "optimizacion", "orientacion", "ordenacion", "orquestador",
                "exception", "entorno", "endpoint", "evento", "entrada",
                "unidad", "utilidades", "usuario", "Curl", "universo",
                "entidad", "expresiones", "excepciones", "extension", "elegancia"
        );

        List<String> lowerMinusiculas = cadenas53.stream().filter(s -> {
            char aux = s.charAt(0);


            if (aux == 'a' || aux == 'e' || aux == 'i' || aux == 'o' || aux == 'u' ||
                    aux == 'A' || aux == 'E' || aux == 'I' || aux == 'O' || aux == 'U') {
                return true;
            }
            return false;
        }).map(s -> s.toLowerCase()).toList();


        Map<String, Integer> nombreEdad = empleados.stream().collect(Collectors.toMap(
                k -> k.nombre,
                v -> v.edad,
                (m1, m2) -> Math.max(m2, m1)
        ));


        Map<String, Map<Boolean, List<Empleado>>> departamentoEmpleadosMayor5000 = empleados.stream().collect(Collectors.groupingBy(
                k -> k.departamento,
                Collectors.partitioningBy(a -> a.salario <= 5000)
        ));

        Comparator<TareaUrgente> compNiveles = Comparator.comparing(a -> a.urgencia.level);
        Comparator<TareaUrgente> compNombre = Comparator.comparing(a -> a.tarea);


        List<TareaUrgente> as = listaTareas.stream().sorted().toList();


        binaryOperator.apply(empleados12.get(0), empleados12.get(1));


        Map<String, List<Integer>> mapPrio = new HashMap<>();
        mapPrio.put("Electronics", Arrays.asList(1500, 2200, 3000));
        mapPrio.put("Clothing", Arrays.asList(500, 800));
        mapPrio.put("Groceries", Arrays.asList(100, 250, 400, 600));
        mapPrio.put("Furniture", Arrays.asList(5000));


        PriorityQueue<Map.Entry<String, List<Integer>>> pr2 = new PriorityQueue<>(
                (o1, o2) -> o1.getValue().size() - o2.getValue().size()
        );


        pr2.addAll(mapPrio.entrySet());


        while (!pr2.isEmpty()) {
            System.out.println(pr2.poll());
        }
        class Alumno {
            int age;
            String name;

            public Alumno(String name, int age) {
                this.age = age;
                this.name = name;
            }
        }


        List<Alumno> alumnos = new ArrayList<>();

        alumnos.add(new Alumno("Ana", 20));
        alumnos.add(new Alumno("Luis", 22));
        alumnos.add(new Alumno("Sofía", 21));
        alumnos.add(new Alumno("Carlos", 23));
        alumnos.add(new Alumno("María", 19));
        alumnos.add(new Alumno("Andrés", 24));
        alumnos.add(new Alumno("Paula", 22));
        alumnos.add(new Alumno("Jorge", 20));
        alumnos.add(new Alumno("Valeria", 21));
        alumnos.add(new Alumno("Diego", 23));



       Optional<Integer> num2 = alumnos.stream().map(aa-> aa.age).sorted(Comparator.reverseOrder()).skip(1).findFirst();


        Map<Character, List<Alumno>> characterListMapAlumnos = alumnos.stream()
                .collect(
                        Collectors.groupingBy(
                                h -> h.name.charAt(0),
                                Collectors.collectingAndThen(
                                        Collectors.toList(),
                                        list -> list.stream()
                                                .sorted(Comparator.comparing(a -> a.age))
                                                .limit(3)
                                                .toList()
                                )
                        )
                );


        System.out.println("break point");
/*
        List<String> cadenas = new ArrayList<>();

        String resposne2 = cadenas.stream()
                .filter(s -> s.length() % 3 == 0)
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining(","));

        System.out.println(resposne2);

        */

/*        int[] numeros = new int[100];
        Arrays.setAll(numeros, i -> i + 1);

// num%10
        Arrays.stream(numeros)
                .filter(n -> n % 2 != 0 && n > 20)
                .filter(n -> n % 10 != 5)
                .forEach(System.out::println);

        List<String> cadenas = Arrays.asList("lambda", "java", "programacion", "cod", "backend");
//-------------------------------------------- 2



 */
//-------------------------------------------- 3 ****

/*
        List<Integer> numeros2 = IntStream.range(0, 100)
                .map(i -> ThreadLocalRandom.current().nextInt(0, 2))
                .boxed()
                .toList();

        Map<Integer, Long> map = numeros2.stream()
                .distinct()
                .collect(
                        Collectors.toMap(
                                n -> n,
                                v -> numeros2.stream().filter(r -> Objects.equals(r, v)).count()
                        ));
        System.out.println(map);


        Map.Entry<Integer, Long> mostRepeated = map.entrySet()
                .stream()
                .max((o1, o2) -> {
                    if (o1.getValue().equals(o2.getValue())) {
                        return o1.getKey() - o2.getKey();
                    }
                    return Math.toIntExact(o1.getValue() - o2.getValue());
                }).get();

        System.out.println(mostRepeated);
*/
//-------------------------------------------- 4 ****
/*
        int[] numeros4 = new int[100];
        Arrays.setAll(numeros4, i -> i + 1);

        Function<Integer, Integer> suma = i -> i + i;
        BiFunction<Integer, Integer, Integer> resta = (a, b) -> a - b;

        int response4 = Arrays.stream(numeros4).boxed().reduce(0, (a, b) -> resta.apply(a, b));

        System.out.println(response4);*/

//-------------------------------------------- 5

        List<String> cadenas5 = Arrays.asList(
                "lambda", "java", "programacion", "cod", "backend",
                "api", "arquitectura", "analitica", "asynchronous", "async",
                "integracion", "inteligencia", "infraestructura", "interfaz", "iterador",
                "operaciones", "optimizacion", "orientacion", "ordenacion", "orquestador",
                "exception", "entorno", "endpoint", "evento", "entrada",
                "unidad", "utilidades", "usuario", "url", "universo",
                "entidad", "expresiones", "excepciones", "extension", "elegancia"
        );


        Map<String, Long> stringIntegerMap = cadenas5.stream()
                .filter(p -> !p.equals("de"))
                .filter(p -> !p.equals("el"))
                .filter(p -> !p.equals("la"))
                .filter(p -> !p.equals("y"))
                .map(p -> p.toLowerCase())
                .collect(Collectors.groupingBy(p -> p,
                        Collectors.counting()));


        Map<Character, List<String>> response5 = cadenas5.stream()
                .collect(Collectors
                        .toMap(
                                k -> k.charAt(0),
                                List::of,
                                (p, n) -> Stream.concat(p.stream(), n.stream())
                                        .toList()
                        ));

        System.out.println(response5);

        //-------------------------------------------- 6 ***


        int[] numeros6A = new int[100];
        Arrays.setAll(numeros6A, i -> i + 1);

        int[] numeros6B = new int[100];
        Arrays.setAll(numeros6B, i -> i + 1);


        List<Integer> response6 = Stream.concat(
                        Arrays.stream(numeros6A).boxed(),
                        Arrays.stream(numeros6B).boxed())
                .peek(System.out::println)
                .filter(n -> n % 7 == 0)
                .toList();

        System.out.println(response6);

        //-------------------------------------------- 9
        /*
        int[] numeros9 = new int[100];
        Arrays.setAll(numeros9, i -> i + 1);

        int sumaPares = Arrays.stream(numeros9)
                .filter(n -> n % 2 == 0)
                .sum();

        double promedioImpar = Arrays.stream(numeros9)
                .filter(n -> n % 2 != 0)
                .average()
                .getAsDouble();

        int diff = Arrays.stream(numeros9).max().getAsInt() - Arrays.stream(numeros9).min().getAsInt();
        */
        //-------------------------------------------- 10
/*
        List<String> cadenas10 = Arrays.asList(
                "lambda", "java", "programacion", "cod", "backend", "dnekcab",
                "api", "arquitectura", "analitica", "asynchronous", "async",
                "integracion", "inteligencia", "infraestructura", "interfaz", "iterador",
                "operaciones", "optimizacion", "orientacion", "ordenacion", "orquestador",
                "exception", "entorno", "endpoint", "evento", "entrada",
                "unidad", "utilidades", "usuario", "url", "universo", "lru",
                "entidad", "expresiones", "excepciones", "extension", "elegancia"
        );

        List<String> response10 = cadenas10.stream()
                .filter(c -> cadenas10.contains(new StringBuilder(c).reverse().toString()))
                .filter(c -> c.length() > 2)
                .sorted()
                .toList();

        System.out.println(response10);
*/
        //-------------------------------------------- 12

        List<String> cadenas12 = Arrays.asList(
                "lambda", "java", "programacion", "cod", "backend", "dnekcab",
                "api", "arquitectura", "analitica", "asynchronous", "async",
                "usuario", "inteligencia", "infraestructura", "interfaz", "optimizacion",
                "usuario", "optimizacion", "optimizacion", "optimizacion", "optimizacion",
                "exception", "entorno", "endpoint", "evento", "entrada",
                "unidad", "utilidades", "usuario", "url", "universo", "usuario",
                "usuario", "expresiones", "usuario", "extension", "elegancia"
        );


        Map<String, Integer> map12 = cadenas12.stream()
                .collect(Collectors.toMap(
                        k -> k,
                        v -> 1,
                        Integer::sum
                ));

        System.out.println(map12);


        //-------------------------------------------- 13

        List<Integer> numeros132 = Arrays.asList(4, 7, 9, 4, 7, 7, 2, 4, 2, 9, 1, 9, 7);


        Map<Integer, Integer> map = numeros132.stream().collect(Collectors.toMap(
                k -> k,
                v -> 1,
                (integer, integer2) -> integer + integer2
        ));


        PriorityQueue<Map.Entry<Integer, Integer>> priorityQueue = new PriorityQueue<>((o1, o2) -> o2.getValue() - o1.getValue());


        while (!priorityQueue.isEmpty()) {

            System.out.println(priorityQueue.poll());

        }

    }

    enum Urgencia {
        HIGH(3), MEDIUM(2), LOW(1);

        final int level;

        Urgencia(int level) {
            this.level = level;
        }
    }

    static class TareaUrgente implements Comparable<TareaUrgente> {
        private Urgencia urgencia;
        private String tarea;
        private boolean isCompleted;

        public TareaUrgente(Urgencia urgencia, String tarea, boolean isCompleted) {
            this.urgencia = urgencia;
            this.tarea = tarea;
            this.isCompleted = isCompleted;
        }

        public Urgencia getUrgencia() {
            return urgencia;
        }

        public String getTarea() {
            return tarea;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TareaUrgente that = (TareaUrgente) o;
            return isCompleted == that.isCompleted && urgencia == that.urgencia && Objects.equals(tarea, that.tarea);
        }

        @Override
        public int hashCode() {
            return Objects.hash(urgencia, tarea, isCompleted);
        }

        @Override
        public String toString() {
            return "TareaUrgente{" +
                    "urgencia=" + urgencia +
                    ", tarea='" + tarea + '\'' +
                    ", isCompleted=" + isCompleted +
                    '}';
        }

        @Override
        public int compareTo(TareaUrgente o) {

            if (this.urgencia == o.urgencia) {
                return o.tarea.compareTo(this.tarea);
            } else {
                return o.urgencia.level - this.urgencia.level;
            }
        }
    }

}


