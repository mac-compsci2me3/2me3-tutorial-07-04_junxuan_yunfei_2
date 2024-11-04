import java.util.ArrayList;
import java.util.List;  

public class Article extends ArticleComponent {
    private List<ArticleComponent> components = new ArrayList<>();

    public void addComponent(ArticleComponent component) {
        components.add(component);
    }

    public void removeComponent(ArticleComponent component) {
        components.remove(component);
    }

    @Override
    public void display() {
        System.out.println("Displaying Article:");
        for (ArticleComponent component : components) {
            component.display();
        }
    }

    /*
    Once you have the iterator class implemented, you also need to modify the Article class so it can instantiate an iterator associated with an article (here is actually using the Factory Method pattern);
    Add a method called iterator() that returns an instance of ArticleIterator initialized with the list of components in an article.
     */
    public ArticleIterator iterator() {
        return new ArticleIterator(components);
    }

}