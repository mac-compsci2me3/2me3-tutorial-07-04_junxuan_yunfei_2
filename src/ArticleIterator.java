import java.util.Iterator;
import java.util.List;

public class ArticleIterator {
    private Iterator<ArticleComponent> iterator;
    private int index;
    public ArticleIterator(List<ArticleComponent> components) {
        this.iterator = components.iterator();
        this.index = 0;
    }
    public boolean hasNext() {
        return iterator.hasNext();
    }
    public ArticleComponent next() {
        index++;
        return iterator.next();
    }
    public int getIndex() {
        return index;
    }
}

/*
Java provides an iterator interface that you can use by importing it (import java.util.iterator), where ArticleIterator class can implement.
ArticleIterator class should also keep an attribute that is used to manage a list of ArticleComponent objects, as well as an attribute that track the current position in the iteration (e.g., index).
Override the hasNext() and next() methods so the iterator can be used to traverse the components in an article.
The constructor of an ArticleIterator object should take a list of ArticleComponents as the argument/parameter, and initialize an iterator by link the attribute to the provided list, and initialize the index to 0.
 */