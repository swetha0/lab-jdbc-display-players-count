package dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.TreeMap;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO
{
	public TreeMap<Integer,Skill> skillCount() throws Exception 
	{
		Statement st = ConnectionManager.getConnection().createStatement();
		ResultSet rs =st.executeQuery("SELECT * FROM PLAYER1");
		
		int battingCount =0;
		int bowlingCount=0;
		int allRounderCount=0;
		
		while(rs.next())
		{
			if(rs.getInt(4)==1)
			{
				battingCount ++;
				
			}
			else if(rs.getInt(4)==2)
			{
				bowlingCount ++;
			}
			else
			{
				allRounderCount ++;
			}
		}
		Skill s1=new Skill(1,"batting");
		Skill s2=new Skill(2,"bowling");
		Skill s3=new Skill(3,"allrounder");
		
		TreeMap<Integer,Skill> map=new TreeMap<Integer,Skill>();
		
		Integer i1= battingCount;
		Integer i2= bowlingCount;
		Integer i3= allRounderCount;
		
		map.put(i1,s1);
		map.put(i2,s2);
		map.put(i3,s3);
	
		return map;
	
	}
	
}
