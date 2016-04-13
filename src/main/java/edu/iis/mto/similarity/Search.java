package edu.iis.mto.similarity;

import java.lang.reflect.Method;

import edu.iis.mto.search.SequenceSearcher;
import edu.iis.mto.search.SearchResult;

public class Search {

	public static SequenceSearcher getSequenceSearcher() {
		 		return new SequenceReturn();
		 	}

}
