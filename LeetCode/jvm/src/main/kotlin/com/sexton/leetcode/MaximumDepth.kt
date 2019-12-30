package com.sexton.leetcode

object MaximumDepth {
    fun maxDepth(root: TreeNode?): Int {
        return if (root == null) {
            0
        } else {
            /* compute the depth of each subtree */
            val leftDepth = maxDepth(root.left)
            val rightDepth = maxDepth(root.right)

            return if (leftDepth > rightDepth) {
                leftDepth + 1
            } else {
                rightDepth + 1
            }
        }
    }

    class TreeNode(var value: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}