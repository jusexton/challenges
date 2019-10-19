package com.sexton.leetcode;

public final class LinkedListIntersection {
    private LinkedListIntersection() {
    }

    public static <T> ListNode<T> getIntersectionNode(final ListNode<T> headOne, final ListNode<T> headTwo) {
        if (headOne == null || headTwo == null) {
            return null;
        }

        ListNode<T> currentOne = headOne;
        ListNode<T> currentTwo = headTwo;
        while (currentOne != currentTwo) {
            currentOne = currentOne == null ? currentTwo : currentOne.getNext();
            currentTwo = currentTwo == null ? currentOne : currentTwo.getNext();
        }

        return currentOne;
    }

    public static class ListNode<T> {
        private T value;
        private ListNode<T> next;

        public ListNode(final T value) {
            this.value = value;
            this.next = null;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public ListNode<T> getNext() {
            return next;
        }

        public void setNext(ListNode<T> next) {
            this.next = next;
        }
    }
}
