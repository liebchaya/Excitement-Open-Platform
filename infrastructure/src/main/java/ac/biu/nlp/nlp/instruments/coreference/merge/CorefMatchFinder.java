package ac.biu.nlp.nlp.instruments.coreference.merge;

import ac.biu.nlp.nlp.general.match.MatchFinder;
import ac.biu.nlp.nlp.instruments.parse.tree.AbstractNode;

/**
 * 
 * Implementation of {@link MatchFinder} for integrating coreference information with
 * given list of trees.
 * Here, the coreference information is given as a {@link WordWithCoreferenceTag}.
 * 
 * @author Asher Stern
 * @see GenericCorefMerger
 * 
 *
 * @param <T> the type of a tree node (typically, a subclass of {@link AbstractNode}).
 */
public abstract class CorefMatchFinder<T> implements MatchFinder<T, WordWithCoreferenceTag>
{
	public boolean areMatch()
	{
		boolean ret = false;
		String nodeWord = getWordOf(this.node);
		if (nodeWord!=null)
		{
			if (this.word!=null)
			{
				if (nodeWord.equalsIgnoreCase(word.getWord()))
					ret = true;
			}
		}
		return ret;
	}

	public void set(T lhs, WordWithCoreferenceTag rhs)
	{
		this.node = lhs;
		this.word = rhs;
	}
	
	protected abstract String getWordOf(T node);
	
	
	protected T node;
	protected WordWithCoreferenceTag word;
}
