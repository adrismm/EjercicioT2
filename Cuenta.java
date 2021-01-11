package EjercicioT2;

public class Cuenta
{
	private int numId;
	private int saldo;
	private Cliente cliente;
	
	public Cuenta()
	{
		numId = 0;
		saldo = 0;
		cliente = new Cliente();
	}

	public Cuenta(int numId, int saldo, Cliente cliente)
	{
		super();
		this.numId = numId;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	public int getNumId()
	{
		return numId;
	}

	public void setNumId(int numId)
	{
		this.numId = numId;
	}

	public int getSaldo()
	{
		return saldo;
	}

	public void setSaldo(int saldo)
	{
		this.saldo = saldo;
	}

	public Cliente getCliente()
	{
		return cliente;
	}

	public void setCliente(Cliente cliente)
	{
		this.cliente = cliente;
	}
	
}
