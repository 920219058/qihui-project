package jdbc;

import java.sql.Connection;
import java.util.LinkedList;

/**
 * ���ӳ�
 * 
 * @author qihui
 *
 */
public class ConnectionPool {
	// ���ӳ��������
	public static final int MAX = 10;
	private LinkedList<Connection> pool = new LinkedList<Connection>();

	public synchronized Connection getConnection() {
		try {
			while (pool.isEmpty()) {
				this.wait();
			}
			return pool.remove(0);
		} catch (Exception e) {
			// TODO: handle exception
		}

		return null;
	}

	public synchronized void addConnection(Connection conn) {
		while (pool.size() >= MAX) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		pool.add(conn);
		// �Ž�ȥ���ӳ� ��������
		this.notifyAll();
	}
}
