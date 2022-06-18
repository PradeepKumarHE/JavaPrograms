package com.pradeep.programs.java8programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
class FilesSet {
	private Long fileId;
	private String fileName;
}

public class FilterEndswithExample {
	public static void main(String[] args) {
		List<FilesSet> dbModelRevision = new ArrayList<FilesSet>();
		dbModelRevision.add(new FilesSet(1L, "abc.xyz"));
		dbModelRevision.add(new FilesSet(2L, "prq.db1"));
		dbModelRevision.add(new FilesSet(3L, "mno.rvt"));
		Optional<FilesSet> fileSet = dbModelRevision.stream().filter(x -> x.getFileName().endsWith(".rvt")).findFirst();
		if (fileSet.isPresent()) {
			System.out.println(fileSet.get().getFileName());
		}
	}
}
