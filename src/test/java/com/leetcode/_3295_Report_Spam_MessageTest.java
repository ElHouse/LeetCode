package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _3295_Report_Spam_MessageTest {

    _3295_Report_Spam_Message reportSpamMessage = new _3295_Report_Spam_Message();


    @Test
    public void test01() {

        assertTrue(reportSpamMessage.reportSpam(new String[]{"hello", "world", "leetcode"},
                new String[]{"world", "hello"}));


        assertFalse(reportSpamMessage.reportSpam(new String[]{"hello", "programming", "fun"},
                new String[]{"world", "programming", "leetcode"}));
    }

}