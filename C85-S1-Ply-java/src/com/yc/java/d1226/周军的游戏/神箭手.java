package com.yc.java.d1226.周军的游戏;

import java.util.Scanner;

public class 神箭手 extends 游侠{
	public void choose() {
		Scanner s=new Scanner(System.in);
		 if(liliang>=18 && zhili>=18 && minjie>=50 && naili>=18) {
			System.out.println("再确认一遍：1 是，2否！");
			int a=s.nextInt();
			if(a==1) {
				System.out.println("转职成功");
				System.out.println("神箭手的专属技能：百步穿杨！");
			}else {
				System.out.println("转职成功");
				System.out.println("神箭手的专属技能：百步穿杨！");
			}
		}
		}

}
