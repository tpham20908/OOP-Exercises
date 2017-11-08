public class Queue {
	private static int front;
	private static int rear;
	private int[] queue = new int[5];

	// constructor
	public Queue() {
		front = rear = -1;
	}

	// insert elements
	public void insert(int value) {
		if (rear == queue.length - 1)
			System.out.println("The Queue if full. Cannot insert anymore.");
		else
		{
			if (front == -1 || rear == -1) {
				front = rear = 0;
				queue[front] = value;
				queue[rear] = value;
			}
			else {
				rear++;
				queue[rear] = value;
			}
		}
	}

	// display queue
	public void display(){
		if (queue.length == 0) {
			System.out.println("Queue is empty! Nothing to print.");
		}
		else {
			for (int i = front; i <= rear; i++) {
				System.out.println(queue[i]);
			}
		}
	}

	// delete elements
	public void delete() {
		int x = 0;
		if (front == -1)
			System.out.println("The queue is empty.");
		else {
			if (front == rear) {
				x = queue[front];
				front = rear = -1;
				display();
			}
			else {
				x = queue[front];
				front++;
				display();
			}
			System.out.println("Item deleted: " + x);
		}
	}
}