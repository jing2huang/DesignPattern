package com.j2h.adapter;

//适配者类：110V电压（原本的接口实现）
public class AC110V implements AC {

	private final int output = 110;
	
	@Override
	public int output() {
		return output;
	}
}