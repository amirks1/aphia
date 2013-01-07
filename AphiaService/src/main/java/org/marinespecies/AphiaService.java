package org.marinespecies;

import java.rmi.RemoteException;

import javax.jws.WebService;
import javax.xml.rpc.ServiceException;

import aphia.v1_0.AphiaNameService;
import aphia.v1_0.AphiaNameServiceLocator;
import aphia.v1_0.AphiaNameServicePortType;
import aphia.v1_0.AphiaRecord;
import aphia.v1_0.Classification;
import aphia.v1_0.Source;
import aphia.v1_0.Vernacular;

@WebService(targetNamespace = "http://marinespecies.org/", portName = "AphiaServicePort", serviceName = "AphiaServiceService")
public class AphiaService implements AphiaNameServicePortType {
	
	public int getAphiaID(String scientificname, boolean marine_only)
			throws RemoteException {
		// TODO Auto-generated method stub		
		AphiaNameService aphiaService = new AphiaNameServiceLocator();		
		int aphiaID=0;
		try {
			AphiaNameServicePortType aphiaPort = aphiaService.getAphiaNameServicePort();
			aphiaID = aphiaPort.getAphiaID(scientificname, marine_only);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return aphiaID;
	}

	
	public AphiaRecord[] getAphiaRecords(String scientificname, boolean like,
			boolean fuzzy, boolean marine_only, int offset)
			throws RemoteException {
		// TODO Auto-generated method stub
		AphiaNameService aphiaService = new AphiaNameServiceLocator();		
		AphiaRecord[] AphiaRecords=null;
		try {
			AphiaNameServicePortType aphiaPort = aphiaService.getAphiaNameServicePort();
			AphiaRecords = aphiaPort.getAphiaRecords(scientificname, like, fuzzy, marine_only, offset);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return AphiaRecords;
	}

	
	public String getAphiaNameByID(int aphiaID) throws RemoteException {
		// TODO Auto-generated method stub		
		AphiaNameService aphiaService = new AphiaNameServiceLocator();		
		String aphiaName="";
		try {
			AphiaNameServicePortType aphiaPort = aphiaService.getAphiaNameServicePort();
			double a = System.nanoTime ();
			aphiaName = aphiaPort.getAphiaNameByID(aphiaID);
			double b = System.nanoTime ();
			System.out.println((b-a)/1000000000);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return aphiaName;
	}

	
	public AphiaRecord getAphiaRecordByID(int aphiaID) throws RemoteException {
		// TODO Auto-generated method stub		
		AphiaNameService aphiaService = new AphiaNameServiceLocator();		
		AphiaRecord aphiaRecord=null;
		try {
			AphiaNameServicePortType aphiaPort = aphiaService.getAphiaNameServicePort();
			double a = System.nanoTime ();
			aphiaRecord = aphiaPort.getAphiaRecordByID(aphiaID);
			double b = System.nanoTime ();
			System.out.println((b-a)/1000000000);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return aphiaRecord;
	}

	
	public AphiaRecord getAphiaRecordByTSN(int TSN) throws RemoteException {
		// TODO Auto-generated method stub
		
		
		AphiaNameService aphiaService = new AphiaNameServiceLocator();		
		AphiaRecord aphiaRecord=null;
		try {
			AphiaNameServicePortType aphiaPort = aphiaService.getAphiaNameServicePort();
			aphiaRecord = aphiaPort.getAphiaRecordByTSN(TSN);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return aphiaRecord;
	}

	
	public AphiaRecord[][] getAphiaRecordsByNames(String[] scientificnames,
			boolean like, boolean fuzzy, boolean marine_only)
			throws RemoteException {
		// TODO Auto-generated method stub
		AphiaNameService aphiaService = new AphiaNameServiceLocator();		
		AphiaRecord[][] aphiaRecords=null;
		try {
			AphiaNameServicePortType aphiaPort = aphiaService.getAphiaNameServicePort();
			aphiaRecords = aphiaPort.getAphiaRecordsByNames(scientificnames, like, fuzzy, marine_only);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return aphiaRecords;
	}

	
	public AphiaRecord[] getAphiaRecordsByVernacular(String vernacular,
			boolean like, int offset) throws RemoteException {
		// TODO Auto-generated method stub
		AphiaNameService aphiaService = new AphiaNameServiceLocator();		
		AphiaRecord[] aphiaRecords=null;
		try {
			AphiaNameServicePortType aphiaPort = aphiaService.getAphiaNameServicePort();
			aphiaRecords = aphiaPort.getAphiaRecordsByVernacular(vernacular, like, offset);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return aphiaRecords;
	}

	
	public Classification getAphiaClassificationByID(int aphiaID)
			throws RemoteException {
		// TODO Auto-generated method stub
		AphiaNameService aphiaService = new AphiaNameServiceLocator();		
		Classification aphiaClassification=null;
		try {
			AphiaNameServicePortType aphiaPort = aphiaService.getAphiaNameServicePort();
			aphiaClassification = aphiaPort.getAphiaClassificationByID(aphiaID);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return aphiaClassification;
	}

	
	public Source[] getSourcesByAphiaID(int aphiaID) throws RemoteException {
		// TODO Auto-generated method stub
		AphiaNameService aphiaService = new AphiaNameServiceLocator();		
		Source[] sources=null;
		try {
			AphiaNameServicePortType aphiaPort = aphiaService.getAphiaNameServicePort();
			sources = aphiaPort.getSourcesByAphiaID(aphiaID);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return sources;
	}

	
	public AphiaRecord[] getAphiaSynonymsByID(int aphiaID)
			throws RemoteException {
		// TODO Auto-generated method stub
		AphiaNameService aphiaService = new AphiaNameServiceLocator();		
		AphiaRecord[] aphiaSynonyms=null;
		try {
			AphiaNameServicePortType aphiaPort = aphiaService.getAphiaNameServicePort();
			aphiaSynonyms = aphiaPort.getAphiaSynonymsByID(aphiaID);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return aphiaSynonyms;
	}

	
	public Vernacular[] getAphiaVernacularsByID(int aphiaID)
			throws RemoteException {
		// TODO Auto-generated method stub
		AphiaNameService aphiaService = new AphiaNameServiceLocator();		
		Vernacular[] aphiaVernaculars=null;
		try {
			AphiaNameServicePortType aphiaPort = aphiaService.getAphiaNameServicePort();
			aphiaVernaculars = aphiaPort.getAphiaVernacularsByID(aphiaID);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return aphiaVernaculars;
	}

	
	public AphiaRecord[] getAphiaChildrenByID(int aphiaID, int offset,
			boolean marine_only) throws RemoteException {
		// TODO Auto-generated method stub
		AphiaNameService aphiaService = new AphiaNameServiceLocator();		
		AphiaRecord[] AphiaChildren=null;
		try {
			AphiaNameServicePortType aphiaPort = aphiaService.getAphiaNameServicePort();
			AphiaChildren = aphiaPort.getAphiaChildrenByID(aphiaID, offset, marine_only);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return AphiaChildren;
	}

}
