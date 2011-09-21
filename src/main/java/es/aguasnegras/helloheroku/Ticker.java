package es.aguasnegras.helloheroku;

import es.aguasnegras.helloheroku.TickDAO;

public class Ticker {

	public static void main(String[] args) {
		TickDAO tickDAO = new TickDAO();
		try {
			while (true) {
				tickDAO.insertTick();
				System.out.println("tick");
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println("Excepcion en Ticker: " + e.getLocalizedMessage());
		}
	}

}
