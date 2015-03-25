package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote{
	
	int count;
	String location;
	State state;

	protected GumballMachine(String location, int numberGumballs) throws RemoteException {
		
		
	}

	@Override
	public int getCount() throws RemoteException {
		// TODO Auto-generated method stub
		return count;
	}

	@Override
	public String getLocation() throws RemoteException {
		// TODO Auto-generated method stub
		return location;
	}

	@Override
	public State getState() throws RemoteException {
		// TODO Auto-generated method stub
		return state;
	}

}
