package com.team.india.details;

import java.util.Scanner;

import com.team.india.players.Players;

public class India {
    private Players players;
    private Scanner sc;
	public void addPlayer() {
		Scanner sc1=new Scanner(System.in);
		Players players=new Players();
		System.out.println("Enter actror player id");
		players.setPid(sc1.nextInt());
		System.out.println("Enter actror player pname");
		players.setPname(sc1.next());
		System.out.println("Enter actror player address");
		players.setAddress(sc1.next());
		System.out.println("Enter actror player mbno");
		players.setMbno(sc1.nextLong());
		System.out.println("Enter actror player salary");
		players.setSalary(sc1.nextDouble());
		System.out.println("Enter actror player age");
		players.setAge(sc1.nextInt());
		System.out.println("Enter actror player status");
		players.setPstatus(sc1.nextBoolean());
		System.out.println("Enter actror player score");
		players.setScore(sc1.nextLong());
	}
	public void viewPlayer() {
		System.out.println(players.getPid());
		System.out.println(players.getPname());
		System.out.println(players.getAddress());
		System.out.println(players.getMbno());
		System.out.println(players.getSalary());
		System.out.println(players.getAge());
		System.out.println(players.getPstatus());
		System.out.println(players.getScore());
		
		}
	public void updateScore() {
		
	           long s=sc.nextLong();
	           long ns=s+players.getScore();
	           players.setScore(ns);
	}
	
	public void viewScore()
    {
      System.out.println(players.getScore());
}
}
