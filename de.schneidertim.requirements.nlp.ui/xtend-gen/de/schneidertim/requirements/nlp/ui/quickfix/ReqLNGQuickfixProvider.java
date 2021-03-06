/**
 * generated by Xtext 2.10.0
 */
package de.schneidertim.requirements.nlp.ui.quickfix;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import de.schneidertim.requirements.conceptselectiondialog.ConceptSelectionDialog;
import de.schneidertim.requirements.nlp.reqLNG.ConceptOrSynonym;
import de.schneidertim.requirements.nlp.reqLNG.Function;
import de.schneidertim.requirements.nlp.reqLNG.FunctionSynonym;
import de.schneidertim.requirements.nlp.reqLNG.Glossary;
import de.schneidertim.requirements.nlp.reqLNG.ReqLNGFactory;
import de.schneidertim.requirements.nlp.reqLNG.RequirementDocument;
import de.schneidertim.requirements.nlp.validation.VerbIsFunctionValidator;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

/**
 * Custom quickfixes.
 * 
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#quick-fixes
 */
@SuppressWarnings("all")
public class ReqLNGQuickfixProvider extends DefaultQuickfixProvider {
  private String DIALOG_TITLE = ":CONCEPT";
  
  @Fix(VerbIsFunctionValidator.CHOOSE_FUNCTION_AND_ADD_AS_SYNONYM)
  public void chooseFunctionAndAddAsSynonym(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final IModification _function = (IModificationContext context) -> {
      String[] _data = issue.getData();
      final String verb = IterableExtensions.<String>head(((Iterable<String>)Conversions.doWrapArray(_data)));
      IXtextDocument _xtextDocument = context.getXtextDocument();
      final IUnitOfWork<Boolean, XtextResource> _function_1 = (XtextResource resource) -> {
        boolean _xblockexpression = false;
        {
          EList<EObject> _contents = resource.getContents();
          Iterable<RequirementDocument> _filter = Iterables.<RequirementDocument>filter(_contents, RequirementDocument.class);
          final RequirementDocument model = IterableExtensions.<RequirementDocument>head(_filter);
          Glossary _glossary = model.getGlossary();
          EList<ConceptOrSynonym> _concepts = _glossary.getConcepts();
          Iterable<Function> _filter_1 = Iterables.<Function>filter(_concepts, Function.class);
          final List<Function> functions = IterableExtensions.<Function>toList(_filter_1);
          final Function1<Function, String> _function_2 = (Function it) -> {
            return it.getName();
          };
          List<String> _map = ListExtensions.<Function, String>map(functions, _function_2);
          final List<String> functionNames = IterableExtensions.<String>toList(_map);
          String _replace = this.DIALOG_TITLE.replace(":CONCEPT", "Functions");
          final ConceptSelectionDialog dialog = this.showSelectionDialog(functionNames, _replace);
          Object[] _result = dialog.getResult();
          boolean _equals = Objects.equal(_result, null);
          if (_equals) {
            return Boolean.valueOf(false);
          }
          Object[] _result_1 = dialog.getResult();
          Object _head = IterableExtensions.<Object>head(((Iterable<Object>)Conversions.doWrapArray(_result_1)));
          final String chosenFunctionName = ((String) _head);
          final Function1<Function, Boolean> _function_3 = (Function a) -> {
            String _name = a.getName();
            return Boolean.valueOf(_name.equals(chosenFunctionName));
          };
          Iterable<Function> _filter_2 = IterableExtensions.<Function>filter(functions, _function_3);
          final Function chosenFunction = IterableExtensions.<Function>head(_filter_2);
          final FunctionSynonym synonym = ReqLNGFactory.eINSTANCE.createFunctionSynonym();
          synonym.setName(verb);
          EList<FunctionSynonym> _synonyms = chosenFunction.getSynonyms();
          _xblockexpression = _synonyms.add(synonym);
        }
        return Boolean.valueOf(_xblockexpression);
      };
      final Boolean modified = _xtextDocument.<Boolean>modify(_function_1);
      if ((modified).booleanValue()) {
        final String reference = (("\"" + verb) + "\"");
        IXtextDocument _xtextDocument_1 = context.getXtextDocument();
        Integer _offset = issue.getOffset();
        Integer _length = issue.getLength();
        final String text = _xtextDocument_1.get((_offset).intValue(), (_length).intValue());
        final int positionInText = text.indexOf(verb);
        IXtextDocument _xtextDocument_2 = context.getXtextDocument();
        Integer _offset_1 = issue.getOffset();
        int _plus = ((_offset_1).intValue() + positionInText);
        int _length_1 = verb.length();
        _xtextDocument_2.replace(_plus, _length_1, reference);
      }
    };
    acceptor.accept(issue, "Choose Function and add as synonym", "Choose Function and add as synonym", "choose.png", _function);
  }
  
  @Fix(VerbIsFunctionValidator.ADD_AS_NEW_FUNCTION)
  public void addAsNewFunction(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final IModification _function = (IModificationContext context) -> {
      String[] _data = issue.getData();
      final String verb = IterableExtensions.<String>head(((Iterable<String>)Conversions.doWrapArray(_data)));
      IXtextDocument _xtextDocument = context.getXtextDocument();
      final IUnitOfWork<Boolean, XtextResource> _function_1 = (XtextResource resource) -> {
        boolean _xblockexpression = false;
        {
          EList<EObject> _contents = resource.getContents();
          Iterable<RequirementDocument> _filter = Iterables.<RequirementDocument>filter(_contents, RequirementDocument.class);
          final RequirementDocument model = IterableExtensions.<RequirementDocument>head(_filter);
          final Function function = ReqLNGFactory.eINSTANCE.createFunction();
          function.setName(verb);
          Glossary _glossary = model.getGlossary();
          EList<ConceptOrSynonym> _concepts = _glossary.getConcepts();
          _xblockexpression = _concepts.add(function);
        }
        return Boolean.valueOf(_xblockexpression);
      };
      final Boolean modified = _xtextDocument.<Boolean>modify(_function_1);
      if ((modified).booleanValue()) {
        final String reference = (("\"" + verb) + "\"");
        IXtextDocument _xtextDocument_1 = context.getXtextDocument();
        Integer _offset = issue.getOffset();
        Integer _length = issue.getLength();
        final String text = _xtextDocument_1.get((_offset).intValue(), (_length).intValue());
        final int positionInText = text.indexOf(verb);
        IXtextDocument _xtextDocument_2 = context.getXtextDocument();
        Integer _offset_1 = issue.getOffset();
        int _plus = ((_offset_1).intValue() + positionInText);
        int _length_1 = verb.length();
        _xtextDocument_2.replace(_plus, _length_1, reference);
      }
    };
    acceptor.accept(issue, "Add as new Function", "Add as new Function", "choose.png", _function);
  }
  
  public ConceptSelectionDialog showSelectionDialog(final List<String> elements, final String title) {
    IWorkbench _workbench = PlatformUI.getWorkbench();
    IWorkbenchWindow _activeWorkbenchWindow = _workbench.getActiveWorkbenchWindow();
    final Shell shell = _activeWorkbenchWindow.getShell();
    final ConceptSelectionDialog dialog = new ConceptSelectionDialog(shell, elements);
    dialog.setInitialPattern("?*");
    dialog.setTitle(title);
    dialog.open();
    return dialog;
  }
}
