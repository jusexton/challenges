from unittest import TestCase

from parameterized import parameterized

from solutions.pathsum import TreeNode, path_sum_exists


def build_populated_test_tree():
    u"""
        2
       / \
      4   3
     / \   \
        7   6
    """
    root_left = TreeNode(4)
    root_left.right = TreeNode(7)

    root_right = TreeNode(3)
    root_right.right = TreeNode(6)

    populated_test_tree = TreeNode(2)
    populated_test_tree.left = root_left
    populated_test_tree.right = root_right

    return populated_test_tree


class TestPathSum(TestCase):
    @parameterized.expand([
        (build_populated_test_tree(), 11),
        (build_populated_test_tree(), 13)
    ])
    def test_should_return_true_when_tree_contains_requested_sum(self, root: TreeNode, expected: int):
        result = path_sum_exists(root, expected)
        self.assertTrue(result)

    @parameterized.expand([
        (None, 0),
        (build_populated_test_tree(), 1),
        (build_populated_test_tree(), 2),
        (build_populated_test_tree(), 5),
        (build_populated_test_tree(), 6),
    ])
    def test_should_return_false_when_tree_contains_requested_sum(self, root: TreeNode, expected: int):
        result = path_sum_exists(root, expected)
        self.assertFalse(result)
