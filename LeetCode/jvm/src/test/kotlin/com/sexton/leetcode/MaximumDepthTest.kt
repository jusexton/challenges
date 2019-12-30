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
            private val builtArgumentStream: Stream<Arguments>

            init {
                // Build depth two tree
                val depthTwoTree = MaximumDepth.TreeNode(1)
                depthTwoTree.left = MaximumDepth.TreeNode(2)
                depthTwoTree.right = MaximumDepth.TreeNode(3)

                // Build depth three tree
                val depthThreeTree = MaximumDepth.TreeNode(1)
                depthThreeTree.left = MaximumDepth.TreeNode(2)
                depthThreeTree.left!!.left = MaximumDepth.TreeNode(3)

                // Build depth four tree
                val depthFourTree = MaximumDepth.TreeNode(1)
                depthFourTree.left = MaximumDepth.TreeNode(2)
                depthFourTree.left!!.left = MaximumDepth.TreeNode(3)
                depthFourTree.left!!.left!!.right = MaximumDepth.TreeNode(4)

                // Build arguments with pair
                builtArgumentStream = arrayOf(
                    Pair(1, MaximumDepth.TreeNode(1)),
                    Pair(2, depthTwoTree),
                    Pair(3, depthThreeTree),
                    Pair(4, depthFourTree)
                ).map {
                    Arguments.of(it.first, it.second)
                }.stream()
            }
        }

        override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> = builtArgumentStream
    }
}