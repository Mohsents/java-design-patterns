package interceptingfilter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
    private final List<Filter> filters;
    private Target target;

    public FilterChain() {
        this.filters = new ArrayList<>();
    }

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    public void execute(String request) {
        for (Filter filter : filters) {
            filter.execute(request);
        }
        target.execute(request);
    }
}
