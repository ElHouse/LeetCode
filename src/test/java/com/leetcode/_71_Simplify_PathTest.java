package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _71_Simplify_PathTest {

    private final _71_Simplify_Path simplifyPath = new _71_Simplify_Path();

    @Test
    public void test01() {
        assertEquals("/home", simplifyPath.simplifyPath("/home/"));
    }

    @Test
    public void test02() {
        assertEquals("/home/foo", simplifyPath.simplifyPath("/home//foo/"));
    }

    @Test
    public void test03() {
        assertEquals("/home/user/Pictures", simplifyPath.simplifyPath("/home/user/Documents/../Pictures"));
    }

    @Test
    public void test04() {
        assertEquals("/", simplifyPath.simplifyPath("/../"));
    }

    @Test
    public void test05() {
        assertEquals("/.../b/d", simplifyPath.simplifyPath("/.../a/../b/c/../d/./"));
    }

    @Test
    public void test06() {
        assertEquals("/b/d", simplifyPath.simplifyPath("/../a/../b/c/../d/./"));
    }

    @Test
    public void test07() {
        assertNull(simplifyPath.simplifyPath(null));
    }

    @Test
    public void test08() {
        assertEquals("/", simplifyPath.simplifyPath("/../../../../../../../../../../../"));
    }

    @Test
    public void test09() {
        assertEquals("/", simplifyPath.simplifyPath("/../../../../../../../../../../../.."));
    }
}