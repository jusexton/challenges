package com.sexton.leetcode

import java.util.concurrent.ConcurrentHashMap

object Isomorphic {
    /**
     * Determines if [strOne] and [strTwo] are isomorphic.
     */
    fun isIsomorphic(strOne: String, strTwo: String): Boolean {
        // Not possible for the strings to be isomorphic if they do not even have the same length.
        if (strOne.length != strTwo.length) {
            return false
        }

        val seen = ConcurrentHashMap<Char, Char>()
        return strOne.zip(strTwo).all {
            // If the first character in the pair has not been seen before.
            if (!seen.containsKey(it.first)) {

                // And the second character in the pair has been seen. Then the strings are not isomorphic.
                if (seen.containsValue(it.second)) {
                    return false
                } else {
                    // Update to show we have seen the character and the character is was seen along side with.
                    // This should never override data, only add
                    seen[it.first] = it.second
                }
            } else {
                // The first character in the pair has been seen.
                // Therefore the value it was seen with must match the value it is now being seen with again.
                // Otherwise, the strings are not isomorphic.
                if (seen[it.first] != it.second) {
                    return false
                }
            }

            true
        }
    }
}