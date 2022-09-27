package com.pradeep.programs.java8programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
class TechnologyWithDevelopers {
	private Integer id;
	private String technology;
	private List<String> developers;	
}
public class FlatMapExample2 {

	public static void main(String[] args) {
		
		List<String> javadevelopers=new ArrayList<String>();
		javadevelopers.add("Pradeep");
		javadevelopers.add("Rajesh");
		javadevelopers.add("Arun");
		javadevelopers.add("Gururaj");
		TechnologyWithDevelopers d1=new TechnologyWithDevelopers(1,"Java",javadevelopers);
		
		List<String> webDevelopers=new ArrayList<String>();
		webDevelopers.add("Pradeep");
		webDevelopers.add("Smitha");
		webDevelopers.add("Nagendra");
		TechnologyWithDevelopers d2=new TechnologyWithDevelopers(2,"ReactJS",webDevelopers);
		
		List<String> fullStackDevelopers=new ArrayList<String>();
		fullStackDevelopers.add("Pradeep");
		fullStackDevelopers.add("Rajesh");
		TechnologyWithDevelopers d3=new TechnologyWithDevelopers(2,"Full stack",fullStackDevelopers);
		
		List<TechnologyWithDevelopers>  technologyWithDevelopersList=new ArrayList<TechnologyWithDevelopers>();
		technologyWithDevelopersList.add(d1);
		technologyWithDevelopersList.add(d2);
		technologyWithDevelopersList.add(d3);
		
		//List<List<String>> developersList=technologyWithDevelopersList.stream().map(e->e.getDevelopers()).collect(Collectors.toList());
		//System.out.println(developersList);
		
		//List<String> developersListSingleArray=technologyWithDevelopersList.stream().flatMap(e->e.getDevelopers().stream()).collect(Collectors.toList());
		//System.out.println(developersListSingleArray);
		
		Set<String> developersListSingleArray=technologyWithDevelopersList.stream().flatMap(e->e.getDevelopers().stream()).collect(Collectors.toSet());
		System.out.println(developersListSingleArray);

	}

}
