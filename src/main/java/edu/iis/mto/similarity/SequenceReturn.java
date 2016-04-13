package edu.iis.mto.similarity;

import edu.iis.mto.search.SearchResult;
import edu.iis.mto.search.SequenceSearcher;

public class SequenceReturn implements SequenceSearcher {

	public SearchResult search(int key, int[] seq) {
		// TODO Auto-generated method stub
		
		for(int licz = 0; licz<seq.length; licz++)
		{
			if(seq[licz]==key)
			{
				return new ResultReturn(true,licz);
			}
		}
		return new ResultReturn(false,-1);
	}

}
