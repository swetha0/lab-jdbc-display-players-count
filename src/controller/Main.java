package controller;

import java.util.Map.Entry;
import java.util.TreeMap;

import dao.SkillDAO;
import model.Skill;

public class Main
{
	public static void main(String args[])throws Exception
	{
		SkillDAO skillDao = new SkillDAO();
		
		TreeMap<Integer,Skill> map = new TreeMap<Integer,Skill>();
		
		map=skillDao.skillCount();
		System.out.println("Id"+"\t"+"Name  "+"\t"+"\t"+"Count");
		
		for(Entry<Integer,Skill> out: map.entrySet())
		{
			int  id=out.getKey();
			Skill skill=out.getValue();
			System.out.println(skill.getSkilld()+"\t"+skill.getSkillName()  +"\t"+"\t"+id);	
		}		
	}
	
}
