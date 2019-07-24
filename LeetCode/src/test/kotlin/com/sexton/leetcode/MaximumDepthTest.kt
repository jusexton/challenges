package com.sexton.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Timeout
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import org.junit.jupiter.params.provider.ArgumentsSource
import java.util.concurrent.TimeUnit
import java.util.stream.Stream

@Timeout(50, unit = TimeUnit.MILLISECONDS)
class MaximumDepthTest {
    // Could be provided by argument provided but want to be a bit more explicit in this case.
    @Test
    fun `should return zero when root is null`() {
        assertEquals(0, MaximumDepth.maxDepth(null))
    }

    @ParameterizedTest
    @ArgumentsSource(MaximumDepthTestArgumentProvider::class)
    fun `should return the maximum depth of binary tree`(expected: Int, tree: MaximumDepth.TreeNode) {
        assertEquals(expected, MaximumDepth.maxDepth(tree))
    }

    class MaximumDepthTestArgumentProvider : ArgumentsProvider {
        companion object {
            private val depthOneTree: Pair<Int, MaximumDepth.TreeNode> = Pair(1, MaximumDepth.TreeNode(1))

            private val depthTwoTree: Pair<Int, MaximumDepth.TreeNode>

            private val treeList: Array<Pair<Int, MaximumDepth.TreeNode>>

            init {
                val root = MaximumDepth.TreeNode(1)
                root.left = MaximumDepth.TreeNode(2)
                root.right = MaximumDepth.TreeNode(3)
                depthTwoTree = Pair(2, root)

                treeList = arrayOf(depthOneTree, depthTwoTree)
            }
        }

        override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> {
            return treeList.map {
                Arguments.of(it.first, it.second)
            }.stream()
        }
    }
}