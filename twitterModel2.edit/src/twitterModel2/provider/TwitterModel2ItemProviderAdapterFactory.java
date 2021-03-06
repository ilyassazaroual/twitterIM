/**
 */
package twitterModel2.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import twitterModel2.util.TwitterModel2AdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TwitterModel2ItemProviderAdapterFactory extends TwitterModel2AdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwitterModel2ItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link twitterModel2.Program} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramItemProvider programItemProvider;

	/**
	 * This creates an adapter for a {@link twitterModel2.Program}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProgramAdapter() {
		if (programItemProvider == null) {
			programItemProvider = new ProgramItemProvider(this);
		}

		return programItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link twitterModel2.Block} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockItemProvider blockItemProvider;

	/**
	 * This creates an adapter for a {@link twitterModel2.Block}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBlockAdapter() {
		if (blockItemProvider == null) {
			blockItemProvider = new BlockItemProvider(this);
		}

		return blockItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link twitterModel2.If} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfItemProvider ifItemProvider;

	/**
	 * This creates an adapter for a {@link twitterModel2.If}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIfAdapter() {
		if (ifItemProvider == null) {
			ifItemProvider = new IfItemProvider(this);
		}

		return ifItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link twitterModel2.DeclarationVar} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclarationVarItemProvider declarationVarItemProvider;

	/**
	 * This creates an adapter for a {@link twitterModel2.DeclarationVar}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeclarationVarAdapter() {
		if (declarationVarItemProvider == null) {
			declarationVarItemProvider = new DeclarationVarItemProvider(this);
		}

		return declarationVarItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link twitterModel2.AND} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ANDItemProvider andItemProvider;

	/**
	 * This creates an adapter for a {@link twitterModel2.AND}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createANDAdapter() {
		if (andItemProvider == null) {
			andItemProvider = new ANDItemProvider(this);
		}

		return andItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link twitterModel2.OR} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ORItemProvider orItemProvider;

	/**
	 * This creates an adapter for a {@link twitterModel2.OR}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createORAdapter() {
		if (orItemProvider == null) {
			orItemProvider = new ORItemProvider(this);
		}

		return orItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link twitterModel2.tweets_user} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected tweets_userItemProvider tweets_userItemProvider;

	/**
	 * This creates an adapter for a {@link twitterModel2.tweets_user}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createtweets_userAdapter() {
		if (tweets_userItemProvider == null) {
			tweets_userItemProvider = new tweets_userItemProvider(this);
		}

		return tweets_userItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link twitterModel2.tweets_location} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected tweets_locationItemProvider tweets_locationItemProvider;

	/**
	 * This creates an adapter for a {@link twitterModel2.tweets_location}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createtweets_locationAdapter() {
		if (tweets_locationItemProvider == null) {
			tweets_locationItemProvider = new tweets_locationItemProvider(this);
		}

		return tweets_locationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link twitterModel2.tweets_entity} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected tweets_entityItemProvider tweets_entityItemProvider;

	/**
	 * This creates an adapter for a {@link twitterModel2.tweets_entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createtweets_entityAdapter() {
		if (tweets_entityItemProvider == null) {
			tweets_entityItemProvider = new tweets_entityItemProvider(this);
		}

		return tweets_entityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link twitterModel2.tweets_date} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected tweets_dateItemProvider tweets_dateItemProvider;

	/**
	 * This creates an adapter for a {@link twitterModel2.tweets_date}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createtweets_dateAdapter() {
		if (tweets_dateItemProvider == null) {
			tweets_dateItemProvider = new tweets_dateItemProvider(this);
		}

		return tweets_dateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link twitterModel2.ProportionPositif} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProportionPositifItemProvider proportionPositifItemProvider;

	/**
	 * This creates an adapter for a {@link twitterModel2.ProportionPositif}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProportionPositifAdapter() {
		if (proportionPositifItemProvider == null) {
			proportionPositifItemProvider = new ProportionPositifItemProvider(this);
		}

		return proportionPositifItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link twitterModel2.ProportionNegatif} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProportionNegatifItemProvider proportionNegatifItemProvider;

	/**
	 * This creates an adapter for a {@link twitterModel2.ProportionNegatif}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProportionNegatifAdapter() {
		if (proportionNegatifItemProvider == null) {
			proportionNegatifItemProvider = new ProportionNegatifItemProvider(this);
		}

		return proportionNegatifItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link twitterModel2.countTweet} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected countTweetItemProvider countTweetItemProvider;

	/**
	 * This creates an adapter for a {@link twitterModel2.countTweet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createcountTweetAdapter() {
		if (countTweetItemProvider == null) {
			countTweetItemProvider = new countTweetItemProvider(this);
		}

		return countTweetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link twitterModel2.countVisitProfil} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected countVisitProfilItemProvider countVisitProfilItemProvider;

	/**
	 * This creates an adapter for a {@link twitterModel2.countVisitProfil}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createcountVisitProfilAdapter() {
		if (countVisitProfilItemProvider == null) {
			countVisitProfilItemProvider = new countVisitProfilItemProvider(this);
		}

		return countVisitProfilItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link twitterModel2.CroissanceAbonne} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CroissanceAbonneItemProvider croissanceAbonneItemProvider;

	/**
	 * This creates an adapter for a {@link twitterModel2.CroissanceAbonne}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCroissanceAbonneAdapter() {
		if (croissanceAbonneItemProvider == null) {
			croissanceAbonneItemProvider = new CroissanceAbonneItemProvider(this);
		}

		return croissanceAbonneItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link twitterModel2.moyFollowers} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected moyFollowersItemProvider moyFollowersItemProvider;

	/**
	 * This creates an adapter for a {@link twitterModel2.moyFollowers}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createmoyFollowersAdapter() {
		if (moyFollowersItemProvider == null) {
			moyFollowersItemProvider = new moyFollowersItemProvider(this);
		}

		return moyFollowersItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link twitterModel2.moyFavorited} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected moyFavoritedItemProvider moyFavoritedItemProvider;

	/**
	 * This creates an adapter for a {@link twitterModel2.moyFavorited}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createmoyFavoritedAdapter() {
		if (moyFavoritedItemProvider == null) {
			moyFavoritedItemProvider = new moyFavoritedItemProvider(this);
		}

		return moyFavoritedItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link twitterModel2.GREATER} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GREATERItemProvider greaterItemProvider;

	/**
	 * This creates an adapter for a {@link twitterModel2.GREATER}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGREATERAdapter() {
		if (greaterItemProvider == null) {
			greaterItemProvider = new GREATERItemProvider(this);
		}

		return greaterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link twitterModel2.LESS} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LESSItemProvider lessItemProvider;

	/**
	 * This creates an adapter for a {@link twitterModel2.LESS}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLESSAdapter() {
		if (lessItemProvider == null) {
			lessItemProvider = new LESSItemProvider(this);
		}

		return lessItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link twitterModel2.EQUALS} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EQUALSItemProvider equalsItemProvider;

	/**
	 * This creates an adapter for a {@link twitterModel2.EQUALS}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEQUALSAdapter() {
		if (equalsItemProvider == null) {
			equalsItemProvider = new EQUALSItemProvider(this);
		}

		return equalsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link twitterModel2.UtilisationVar} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UtilisationVarItemProvider utilisationVarItemProvider;

	/**
	 * This creates an adapter for a {@link twitterModel2.UtilisationVar}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUtilisationVarAdapter() {
		if (utilisationVarItemProvider == null) {
			utilisationVarItemProvider = new UtilisationVarItemProvider(this);
		}

		return utilisationVarItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link twitterModel2.print} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected printItemProvider printItemProvider;

	/**
	 * This creates an adapter for a {@link twitterModel2.print}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createprintAdapter() {
		if (printItemProvider == null) {
			printItemProvider = new printItemProvider(this);
		}

		return printItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link twitterModel2.StringTw} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringTwItemProvider stringTwItemProvider;

	/**
	 * This creates an adapter for a {@link twitterModel2.StringTw}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStringTwAdapter() {
		if (stringTwItemProvider == null) {
			stringTwItemProvider = new StringTwItemProvider(this);
		}

		return stringTwItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link twitterModel2.ADD} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ADDItemProvider addItemProvider;

	/**
	 * This creates an adapter for a {@link twitterModel2.ADD}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createADDAdapter() {
		if (addItemProvider == null) {
			addItemProvider = new ADDItemProvider(this);
		}

		return addItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link twitterModel2.MUL} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MULItemProvider mulItemProvider;

	/**
	 * This creates an adapter for a {@link twitterModel2.MUL}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMULAdapter() {
		if (mulItemProvider == null) {
			mulItemProvider = new MULItemProvider(this);
		}

		return mulItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (programItemProvider != null) programItemProvider.dispose();
		if (blockItemProvider != null) blockItemProvider.dispose();
		if (ifItemProvider != null) ifItemProvider.dispose();
		if (declarationVarItemProvider != null) declarationVarItemProvider.dispose();
		if (andItemProvider != null) andItemProvider.dispose();
		if (orItemProvider != null) orItemProvider.dispose();
		if (tweets_userItemProvider != null) tweets_userItemProvider.dispose();
		if (tweets_locationItemProvider != null) tweets_locationItemProvider.dispose();
		if (tweets_entityItemProvider != null) tweets_entityItemProvider.dispose();
		if (tweets_dateItemProvider != null) tweets_dateItemProvider.dispose();
		if (proportionPositifItemProvider != null) proportionPositifItemProvider.dispose();
		if (proportionNegatifItemProvider != null) proportionNegatifItemProvider.dispose();
		if (countTweetItemProvider != null) countTweetItemProvider.dispose();
		if (countVisitProfilItemProvider != null) countVisitProfilItemProvider.dispose();
		if (croissanceAbonneItemProvider != null) croissanceAbonneItemProvider.dispose();
		if (moyFollowersItemProvider != null) moyFollowersItemProvider.dispose();
		if (moyFavoritedItemProvider != null) moyFavoritedItemProvider.dispose();
		if (greaterItemProvider != null) greaterItemProvider.dispose();
		if (lessItemProvider != null) lessItemProvider.dispose();
		if (equalsItemProvider != null) equalsItemProvider.dispose();
		if (utilisationVarItemProvider != null) utilisationVarItemProvider.dispose();
		if (printItemProvider != null) printItemProvider.dispose();
		if (stringTwItemProvider != null) stringTwItemProvider.dispose();
		if (addItemProvider != null) addItemProvider.dispose();
		if (mulItemProvider != null) mulItemProvider.dispose();
	}

}
