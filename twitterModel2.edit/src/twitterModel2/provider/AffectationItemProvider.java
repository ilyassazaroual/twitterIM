/**
 */
package twitterModel2.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import twitterModel2.Affectation;
import twitterModel2.TwitterModel2Factory;
import twitterModel2.TwitterModel2Package;

/**
 * This is the item provider adapter for a {@link twitterModel2.Affectation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AffectationItemProvider extends ExpBinaireItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AffectationItemProvider(AdapterFactory adapterFactory) {
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

			addVariablePropertyDescriptor(object);
			addOpDroitePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Variable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVariablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Affectation_variable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Affectation_variable_feature", "_UI_Affectation_type"),
				 TwitterModel2Package.Literals.AFFECTATION__VARIABLE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Op Droite feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOpDroitePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Affectation_opDroite_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Affectation_opDroite_feature", "_UI_Affectation_type"),
				 TwitterModel2Package.Literals.AFFECTATION__OP_DROITE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
			childrenFeatures.add(TwitterModel2Package.Literals.AFFECTATION__VARIABLE);
			childrenFeatures.add(TwitterModel2Package.Literals.AFFECTATION__OP_DROITE);
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
	 * This returns Affectation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Affectation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Affectation_type");
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

		switch (notification.getFeatureID(Affectation.class)) {
			case TwitterModel2Package.AFFECTATION__VARIABLE:
			case TwitterModel2Package.AFFECTATION__OP_DROITE:
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
				(TwitterModel2Package.Literals.AFFECTATION__VARIABLE,
				 TwitterModel2Factory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.AFFECTATION__OP_DROITE,
				 TwitterModel2Factory.eINSTANCE.createConst()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.AFFECTATION__OP_DROITE,
				 TwitterModel2Factory.eINSTANCE.createAffectation()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.AFFECTATION__OP_DROITE,
				 TwitterModel2Factory.eINSTANCE.createAnd()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.AFFECTATION__OP_DROITE,
				 TwitterModel2Factory.eINSTANCE.createOr()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.AFFECTATION__OP_DROITE,
				 TwitterModel2Factory.eINSTANCE.createXor()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.AFFECTATION__OP_DROITE,
				 TwitterModel2Factory.eINSTANCE.createtweets_user()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.AFFECTATION__OP_DROITE,
				 TwitterModel2Factory.eINSTANCE.createtweets_location()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.AFFECTATION__OP_DROITE,
				 TwitterModel2Factory.eINSTANCE.createtweets_entity()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.AFFECTATION__OP_DROITE,
				 TwitterModel2Factory.eINSTANCE.createtweets_date()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.AFFECTATION__OP_DROITE,
				 TwitterModel2Factory.eINSTANCE.createProportionPositif()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.AFFECTATION__OP_DROITE,
				 TwitterModel2Factory.eINSTANCE.createProportionNegatif()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.AFFECTATION__OP_DROITE,
				 TwitterModel2Factory.eINSTANCE.createcountTweet()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.AFFECTATION__OP_DROITE,
				 TwitterModel2Factory.eINSTANCE.createcountVisitProfil()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.AFFECTATION__OP_DROITE,
				 TwitterModel2Factory.eINSTANCE.createCroissanceAbonne()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.AFFECTATION__OP_DROITE,
				 TwitterModel2Factory.eINSTANCE.createmoyFollowers()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.AFFECTATION__OP_DROITE,
				 TwitterModel2Factory.eINSTANCE.createmoyFavorited()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.AFFECTATION__OP_DROITE,
				 TwitterModel2Factory.eINSTANCE.createGreater()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.AFFECTATION__OP_DROITE,
				 TwitterModel2Factory.eINSTANCE.createLess()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.AFFECTATION__OP_DROITE,
				 TwitterModel2Factory.eINSTANCE.createEqual()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.AFFECTATION__OP_DROITE,
				 TwitterModel2Factory.eINSTANCE.createSupEgal()));
	}

}
