/**
 */
package ttc2019.live.bibtex;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thesis Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ttc2019.live.bibtex.ThesisEntry#getSchool <em>School</em>}</li>
 * </ul>
 *
 * @see ttc2019.live.bibtex.BibtexPackage#getThesisEntry()
 * @model abstract="true"
 * @generated
 */
public interface ThesisEntry extends AuthoredEntry, DatedEntry, TitledEntry {
	/**
	 * Returns the value of the '<em><b>School</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>School</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>School</em>' attribute.
	 * @see #setSchool(String)
	 * @see ttc2019.live.bibtex.BibtexPackage#getThesisEntry_School()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getSchool();

	/**
	 * Sets the value of the '{@link ttc2019.live.bibtex.ThesisEntry#getSchool <em>School</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>School</em>' attribute.
	 * @see #getSchool()
	 * @generated
	 */
	void setSchool(String value);

} // ThesisEntry
