package jdbc;

import java.sql.Connection;
import java.util.LinkedList;

/**
 * 链接池
 * 
 * @author qihui
 *
 */
public class ConnectionPool {
	// 连接池最大数量
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
		// 放进去连接池 唤醒链接
		this.notifyAll();
	}
}
