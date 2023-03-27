package be.iccbxl.poo;

import java.util.Comparator;

public class ListeElectoralSiegeComparator implements Comparator<ListeElectorale> {

	@Override
	public int compare(ListeElectorale l1, ListeElectorale l2) {
		return l2.getSieges() - l1.getSieges();
	}

}
