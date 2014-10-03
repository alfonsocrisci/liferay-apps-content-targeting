/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.content.targeting.report.campaign.newsletter.service.base;

import com.liferay.content.targeting.report.campaign.newsletter.model.Newsletter;
import com.liferay.content.targeting.report.campaign.newsletter.service.NewsletterService;
import com.liferay.content.targeting.report.campaign.newsletter.service.persistence.NewsletterFinder;
import com.liferay.content.targeting.report.campaign.newsletter.service.persistence.NewsletterPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the newsletter remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.liferay.content.targeting.report.campaign.newsletter.service.impl.NewsletterServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.content.targeting.report.campaign.newsletter.service.impl.NewsletterServiceImpl
 * @see com.liferay.content.targeting.report.campaign.newsletter.service.NewsletterServiceUtil
 * @generated
 */
public abstract class NewsletterServiceBaseImpl extends BaseServiceImpl
	implements NewsletterService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.liferay.content.targeting.report.campaign.newsletter.service.NewsletterServiceUtil} to access the newsletter remote service.
	 */

	/**
	 * Returns the newsletter local service.
	 *
	 * @return the newsletter local service
	 */
	public com.liferay.content.targeting.report.campaign.newsletter.service.NewsletterLocalService getNewsletterLocalService() {
		return newsletterLocalService;
	}

	/**
	 * Sets the newsletter local service.
	 *
	 * @param newsletterLocalService the newsletter local service
	 */
	public void setNewsletterLocalService(
		com.liferay.content.targeting.report.campaign.newsletter.service.NewsletterLocalService newsletterLocalService) {
		this.newsletterLocalService = newsletterLocalService;
	}

	/**
	 * Returns the newsletter remote service.
	 *
	 * @return the newsletter remote service
	 */
	public com.liferay.content.targeting.report.campaign.newsletter.service.NewsletterService getNewsletterService() {
		return newsletterService;
	}

	/**
	 * Sets the newsletter remote service.
	 *
	 * @param newsletterService the newsletter remote service
	 */
	public void setNewsletterService(
		com.liferay.content.targeting.report.campaign.newsletter.service.NewsletterService newsletterService) {
		this.newsletterService = newsletterService;
	}

	/**
	 * Returns the newsletter persistence.
	 *
	 * @return the newsletter persistence
	 */
	public NewsletterPersistence getNewsletterPersistence() {
		return newsletterPersistence;
	}

	/**
	 * Sets the newsletter persistence.
	 *
	 * @param newsletterPersistence the newsletter persistence
	 */
	public void setNewsletterPersistence(
		NewsletterPersistence newsletterPersistence) {
		this.newsletterPersistence = newsletterPersistence;
	}

	/**
	 * Returns the newsletter finder.
	 *
	 * @return the newsletter finder
	 */
	public NewsletterFinder getNewsletterFinder() {
		return newsletterFinder;
	}

	/**
	 * Sets the newsletter finder.
	 *
	 * @param newsletterFinder the newsletter finder
	 */
	public void setNewsletterFinder(NewsletterFinder newsletterFinder) {
		this.newsletterFinder = newsletterFinder;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();
	}

	public void destroy() {
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return Newsletter.class;
	}

	protected String getModelClassName() {
		return Newsletter.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = newsletterPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.liferay.content.targeting.report.campaign.newsletter.service.NewsletterLocalService.class)
	protected com.liferay.content.targeting.report.campaign.newsletter.service.NewsletterLocalService newsletterLocalService;
	@BeanReference(type = com.liferay.content.targeting.report.campaign.newsletter.service.NewsletterService.class)
	protected com.liferay.content.targeting.report.campaign.newsletter.service.NewsletterService newsletterService;
	@BeanReference(type = NewsletterPersistence.class)
	protected NewsletterPersistence newsletterPersistence;
	@BeanReference(type = NewsletterFinder.class)
	protected NewsletterFinder newsletterFinder;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private NewsletterServiceClpInvoker _clpInvoker = new NewsletterServiceClpInvoker();
}