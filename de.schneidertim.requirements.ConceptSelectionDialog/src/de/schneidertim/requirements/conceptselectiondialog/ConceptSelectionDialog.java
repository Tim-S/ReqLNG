package de.schneidertim.requirements.conceptselectiondialog;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.FilteredItemsSelectionDialog;

public class ConceptSelectionDialog extends FilteredItemsSelectionDialog {

	private static final String DIALOG_SETTINGS = "FilteredResourcesSelectionDialogExampleSettings";
	private static List<String> elements = null;
	
	public ConceptSelectionDialog(Shell shell, List<String> elements) {
		super(shell);
		ConceptSelectionDialog.elements = elements;
	}

	@Override
	protected Control createExtendedContentArea(Composite parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected IDialogSettings getDialogSettings() {
		IDialogSettings settings = Activator.getDefault().getDialogSettings()
				.getSection(DIALOG_SETTINGS);
		if (settings == null) {
			settings = Activator.getDefault().getDialogSettings()
					.addNewSection(DIALOG_SETTINGS);
		}
		return settings;
	}

	@Override
	protected ItemsFilter createFilter() {
		return new ItemsFilter() {
			public boolean matchItem(Object item) {
				return matches(item.toString());
			}

			public boolean isConsistentItem(Object item) {
				return true;
			}
		};
	}

	@Override
	protected Comparator getItemsComparator() {
		return new Comparator() {
	         public int compare(Object arg0, Object arg1) {
	            return arg0.toString().compareTo(arg1.toString());
	         }
	      };
	}

	@Override
	public String getElementName(Object item) {
		return item.toString();
	}

	@Override
	protected IStatus validateItem(Object item) {
		return Status.OK_STATUS;
	}

	@Override
	protected void fillContentProvider(AbstractContentProvider contentProvider, ItemsFilter itemsFilter,
			IProgressMonitor progressMonitor) throws CoreException {
		progressMonitor.beginTask("Searching", elements.size()); //$NON-NLS-1$
		for (Iterator<String> iter = elements.iterator(); iter.hasNext();) {
			contentProvider.add(iter.next(), itemsFilter);
			progressMonitor.worked(1);
		}
		progressMonitor.done();
	}

}
