/**
 * Copyright (c) 2010-2012 ISBAN S.L
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 * 		Ruben De Dios (ISBAN S.L)
 * 		Andrez Alvarez Mattos (ISBAN S.L)
 */
package org.eclipse.gmf.tooling.simplemap.model.triggers.link;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.TriggerListener;
import org.eclipse.gmf.tooling.simplemap.simplemappings.SimpleLinkMapping;
import org.eclipse.gmf.tooling.simplemap.simplemappings.SimplemappingsPackage;

public class SimpleLinkMappingTriggerListener extends TriggerListener implements ResourceSetListener {

	public static NotificationFilter setLinkMappingNameFilter;

	public SimpleLinkMappingTriggerListener() {
		super(NotificationFilter.createNotifierTypeFilter(SimpleLinkMapping.class));
	}

	static {

		setLinkMappingNameFilter = NotificationFilter.createNotifierTypeFilter(SimpleLinkMapping.class).and(NotificationFilter.createEventTypeFilter(Notification.SET))
				.and(NotificationFilter.createFeatureFilter(SimpleLinkMapping.class, SimplemappingsPackage.SIMPLE_LINK_MAPPING__NAME));

	}

	@Override
	protected Command trigger(TransactionalEditingDomain domain, Notification notification) {

		if (setLinkMappingNameFilter.matches(notification)) {
			SimpleLinkMapping linkMapping = (SimpleLinkMapping) notification.getNotifier();
			String newName = (String) notification.getNewValue();

			return new SetLinkMappingNameTrigger(domain, linkMapping, newName);
		}

		return null;
	}

}
