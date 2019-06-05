package com.soc.exames.action;

import com.opensymphony.xwork2.ActionSupport;
import com.soc.exames.webservice.Exame;
import com.soc.exames.webservice.ExamesServer;
import com.soc.exames.webservice.ExamesServerImplService;
import com.soc.exames.webservice.ExamesServerImplServiceLocator;

public class ExameAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	
	private Exame exame = new Exame();
	private String exameId;
	
	public String index()
	{
		return SUCCESS;
	}
	
	public String showExame()
	{
		try	{
			ExamesServerImplService exameImplService = new ExamesServerImplServiceLocator();
			ExamesServer exameServer = exameImplService.getExamesServerImplPort();
			exame = exameServer.getExame(Long.parseLong(exameId));
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return SUCCESS;
	}
	
	public Exame getExame() 
	{
		return exame;
	}

	public String getExameId() {
		return exameId;
	}

	public void setExameId(String exameId) {
		this.exameId = exameId;
	}

	public void setExame(Exame exame) {
		this.exame = exame;
	}
	
	

}
