import org.eclipse.jgit.attributes.Attribute;
import org.eclipse.jgit.lib.Constants;
			if (walk.getAttributesNodeProvider() != null) {
				entry.diffAttribute = walk.getAttributes()
						.get(Constants.ATTR_DIFF);
			}

		del.diffAttribute = entry.diffAttribute;
		add.diffAttribute = entry.diffAttribute;
		r.diffAttribute = dst.diffAttribute;
	/**
	 * diff filter attribute
	 *
	 * @since 4.11
	 */
	protected Attribute diffAttribute;

	/**
	 * @return the {@link Attribute} determining filters to be applied.
	 * @since 4.11
	 */
	public Attribute getDiffAttribute() {
		return diffAttribute;
	}
