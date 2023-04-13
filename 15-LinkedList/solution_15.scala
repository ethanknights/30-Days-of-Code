// Create a linked_list class that, with a Node class, can insert new data whilst maintaining the position of the list's head.

class Node(var data: Int) {
    var next: Node = null
}

class linked_list {
    def display(head: Node): Unit = {
        var current = head
        while (current != null) {
        print(current.data + " ")
        current = current.next
        }
    }

    def insert(head: Node, data: Int): Node = {
        if (head == null) {
            return new Node(data)
        }
        var curr = head
        while (curr.next != null) {
            curr = curr.next
        }
        curr.next = new Node(data)
        head
    }

}

object Solution {
    def main(args: Array[String]): Unit = {
        val mylist = new linked_list()
        val T = scala.io.StdIn.readInt()
        var head: Node = null
        for (_ <- 1 to T) {
            val data = scala.io.StdIn.readInt()
            head = mylist.insert(head, data)
        }
        mylist.display(head)
    }
}
