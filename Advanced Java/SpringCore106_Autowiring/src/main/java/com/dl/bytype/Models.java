package com.dl.bytype;

public class Models
{
	private int vno;
	private String vnames;
	
	public int getVno() {
		return vno;
	}
	public void setVno(int vno) {
		this.vno = vno;
	}
	public String getVnames() {
		return vnames;
	}
	public void setVnames(String vnames) {
		this.vnames = vnames;
	}
	
	@Override
	public String toString() {
		return "Models [vno=" + vno + ", vnames=" + vnames + "]";
	}
}
