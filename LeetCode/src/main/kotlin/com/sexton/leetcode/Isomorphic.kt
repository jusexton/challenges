package com.sexton.leetcode

import java.util.concurrent.ConcurrentHashMap

object Isomorphic {
    fun isIsomorphic(strOne: String, strTwo: String): Boolean {
        if (strOne.length != strTwo.length) {
            return false
        }

        val seen = ConcurrentHashMap<Char, Char>()
        return strOne.zip(strTwo).all {
            if (!seen.containsKey(it.first)) {
                if (seen.containsValue(it.second)) {
                    return false
                } else {
                    seen[it.first] = it.second
                }
            } else {
                if (seen[it.first] != it.second) {
                    return false
                }
            }
            return true
        }
    }
}