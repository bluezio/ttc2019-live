/**
 */
package ttc2019.live.changes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composition Property Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ttc2019.live.changes.CompositionPropertyChange#getNewValue <em>New Value</em>}</li>
 *   <li>{@link ttc2019.live.changes.CompositionPropertyChange#getOldValue <em>Old Value</em>}</li>
 * </ul>
 *
 * @see ttc2019.live.changes.ChangesPackage#getCompositionPropertyChange()
 * @model
 * @generated
 */
public interface CompositionPropertyChange extends CompositionChange {
	/**
	 * Returns the value of the '<em><b>New Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Value</em>' reference.
	 * @see #setNewValue(EObject)
	 * @see ttc2019.live.changes.ChangesPackage#getCompositionPropertyChange_NewValue()
	 * @model
	 * @generated
	 */
	EObject getNewValue();

	/**
	 * Sets the value of the '{@link ttc2019.live.changes.CompositionPropertyChange#getNewValue <em>New Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Value</em>' reference.
	 * @see #getNewValue()
	 * @generated
	 */
	void setNewValue(EObject value);

	/**
	 * Returns the value of the '<em><b>Old Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Value</em>' reference.
	 * @see #setOldValue(EObject)
	 * @see ttc2019.live.changes.ChangesPackage#getCompositionPropertyChange_OldValue()
	 * @model
	 * @generated
	 */
	EObject getOldValue();

	/**
	 * Sets the value of the '{@link ttc2019.live.changes.CompositionPropertyChange#getOldValue <em>Old Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Value</em>' reference.
	 * @see #getOldValue()
	 * @generated
	 */
	void setOldValue(EObject value);

} // CompositionPropertyChange