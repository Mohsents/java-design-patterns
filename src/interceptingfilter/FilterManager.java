package interceptingfilter;

public class FilterManager {
    private final FilterChain filterChain = new FilterChain();

    public FilterManager(Target target) {
        filterChain.setTarget(target);
    }

    public void setFilter(Filter filter) {
        filterChain.addFilter(filter);
    }

    public void filterRequest(String request) {
        filterChain.execute(request);
    }
}
