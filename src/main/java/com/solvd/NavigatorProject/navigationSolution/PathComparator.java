package com.solvd.NavigatorProject.navigationSolution;

import java.util.Comparator;

public class PathComparator implements Comparator<Path> {

	@Override
	public int compare(Path arg0, Path arg1) {
		return Double.compare((arg0.getTotalDistance()),arg1.getTotalDistance());
	}
}
