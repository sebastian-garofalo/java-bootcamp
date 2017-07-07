package filters;

/**
 * @author andres.vaninetti
 *
 *         This class is used to create composed filters, and filter teams by
 *         multiples conditions.
 */
public abstract class ComposedFilter implements Filter {

	protected Filter filtroA;

	public ComposedFilter(Filter f) {
		this.filtroA = f;
	}

}
