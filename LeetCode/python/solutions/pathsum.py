from typing import Optional


class TreeNode:
    def __init__(self,
                 value: int,
                 left: Optional['TreeNode'] = None,
                 right: Optional['TreeNode'] = None):
        self.value = value
        self.left = left
        self.right = right


def path_sum_exists(root: TreeNode, expected: int) -> bool:
    return _path_sum_exists(root, expected, 0)


def _path_sum_exists(root: Optional[TreeNode], expected: int, total: int) -> bool:
    if root is None:
        return False

    new_total = root.value + total

    if root.left is None and root.right is None:
        return new_total == expected

    return _path_sum_exists(root.left, expected, new_total) or _path_sum_exists(root.right, expected, new_total)
