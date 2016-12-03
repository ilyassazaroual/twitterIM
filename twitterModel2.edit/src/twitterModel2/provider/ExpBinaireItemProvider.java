/**
 */
package twitterModel2.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import twitterModel2.ExpBinaire;
import twitterModel2.TwitterModel2Factory;
import twitterModel2.TwitterModel2Package;

/**
 * This is the item provider adapter for a {@link twitterModel2.ExpBinaire} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpBinaireItemProvider extends ExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpBinaireItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(TwitterModel2Package.Literals.EXP_BINAIRE__EXP1);
			childrenFeatures.add(TwitterModel2Package.Literals.EXP_BINAIRE__EXP2);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ExpBinaire.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ExpBinaire"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ExpBinaire_type");
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ExpBinaire.class)) {
			case TwitterModel2Package.EXP_BINAIRE__EXP1:
			case TwitterModel2Package.EXP_BINAIRE__EXP2:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.EXP_BINAIRE__EXP1,
				 TwitterModel2Factory.eINSTANCE.createAND()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.EXP_BINAIRE__EXP1,
				 TwitterModel2Factory.eINSTANCE.createOR()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.EXP_BINAIRE__EXP1,
				 TwitterModel2Factory.eINSTANCE.createtweets_user()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.EXP_BINAIRE__EXP1,
				 TwitterModel2Factory.eINSTANCE.createtweets_location()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.EXP_BINAIRE__EXP1,
				 TwitterModel2Factory.eINSTANCE.createtweets_entity()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.EXP_BINAIRE__EXP1,
				 TwitterModel2Factory.eINSTANCE.createtweets_date()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.EXP_BINAIRE__EXP1,
				 TwitterModel2Factory.eINSTANCE.createProportionPositif()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.EXP_BINAIRE__EXP1,
				 TwitterModel2Factory.eINSTANCE.createProportionNegatif()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.EXP_BINAIRE__EXP1,
				 TwitterModel2Factory.eINSTANCE.createcountTweet()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.EXP_BINAIRE__EXP1,
				 TwitterModel2Factory.eINSTANCE.createcountVisitProfil()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.EXP_BINAIRE__EXP1,
				 TwitterModel2Factory.eINSTANCE.createCroissanceAbonne()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.EXP_BINAIRE__EXP1,
				 TwitterModel2Factory.eINSTANCE.createmoyFollowers()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.EXP_BINAIRE__EXP1,
				 TwitterModel2Factory.eINSTANCE.createmoyFavorited()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.EXP_BINAIRE__EXP1,
				 TwitterModel2Factory.eINSTANCE.createGREATER()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.EXP_BINAIRE__EXP1,
				 TwitterModel2Factory.eINSTANCE.createLESS()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.EXP_BINAIRE__EXP1,
				 TwitterModel2Factory.eINSTANCE.createEQUALS()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.EXP_BINAIRE__EXP1,
				 TwitterModel2Factory.eINSTANCE.createUtilisationVar()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.EXP_BINAIRE__EXP1,
				 TwitterModel2Factory.eINSTANCE.createStringTw()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.EXP_BINAIRE__EXP1,
				 TwitterModel2Factory.eINSTANCE.createADD()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.EXP_BINAIRE__EXP1,
				 TwitterModel2Factory.eINSTANCE.createMUL()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.EXP_BINAIRE__EXP2,
				 TwitterModel2Factory.eINSTANCE.createAND()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.EXP_BINAIRE__EXP2,
				 TwitterModel2Factory.eINSTANCE.createOR()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.EXP_BINAIRE__EXP2,
				 TwitterModel2Factory.eINSTANCE.createtweets_user()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.EXP_BINAIRE__EXP2,
				 TwitterModel2Factory.eINSTANCE.createtweets_location()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.EXP_BINAIRE__EXP2,
				 TwitterModel2Factory.eINSTANCE.createtweets_entity()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.EXP_BINAIRE__EXP2,
				 TwitterModel2Factory.eINSTANCE.createtweets_date()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.EXP_BINAIRE__EXP2,
				 TwitterModel2Factory.eINSTANCE.createProportionPositif()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.EXP_BINAIRE__EXP2,
				 TwitterModel2Factory.eINSTANCE.createProportionNegatif()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.EXP_BINAIRE__EXP2,
				 TwitterModel2Factory.eINSTANCE.createcountTweet()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.EXP_BINAIRE__EXP2,
				 TwitterModel2Factory.eINSTANCE.createcountVisitProfil()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.EXP_BINAIRE__EXP2,
				 TwitterModel2Factory.eINSTANCE.createCroissanceAbonne()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.EXP_BINAIRE__EXP2,
				 TwitterModel2Factory.eINSTANCE.createmoyFollowers()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.EXP_BINAIRE__EXP2,
				 TwitterModel2Factory.eINSTANCE.createmoyFavorited()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.EXP_BINAIRE__EXP2,
				 TwitterModel2Factory.eINSTANCE.createGREATER()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.EXP_BINAIRE__EXP2,
				 TwitterModel2Factory.eINSTANCE.createLESS()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.EXP_BINAIRE__EXP2,
				 TwitterModel2Factory.eINSTANCE.createEQUALS()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.EXP_BINAIRE__EXP2,
				 TwitterModel2Factory.eINSTANCE.createUtilisationVar()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.EXP_BINAIRE__EXP2,
				 TwitterModel2Factory.eINSTANCE.createStringTw()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.EXP_BINAIRE__EXP2,
				 TwitterModel2Factory.eINSTANCE.createADD()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.EXP_BINAIRE__EXP2,
				 TwitterModel2Factory.eINSTANCE.createMUL()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == TwitterModel2Package.Literals.EXP_BINAIRE__EXP1 ||
			childFeature == TwitterModel2Package.Literals.EXP_BINAIRE__EXP2;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
