/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.servicecatalog;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.servicecatalog.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing AWS Service Catalog asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>AWS Service Catalog</fullname>
 * <p>
 * <b>Overview</b>
 * </p>
 * <p>
 * <a href="https://aws.amazon.com/servicecatalog/">AWS Service Catalog</a> allows organizations to create and manage
 * catalogs of IT services that are approved for use on AWS. This documentation provides reference material for the AWS
 * Service Catalog end user API. To get the most out of this documentation, you need to be familiar with the terminology
 * discussed in <a href="http://docs.aws.amazon.com/servicecatalog/latest/userguide/what-is_concepts.html">AWS Service
 * Catalog Concepts</a>.
 * </p>
 * <p>
 * <i>Additional Resources</i>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html">AWS Service Catalog
 * Administrator Guide</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/servicecatalog/latest/userguide/introduction.html">AWS Service Catalog User
 * Guide</a>
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSServiceCatalogAsyncClient extends AWSServiceCatalogClient implements AWSServiceCatalogAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Service Catalog. A credentials provider
     * chain will be used that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Credential profiles file at the default location (~/.aws/credentials) shared by all AWS SDKs and the AWS CLI</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSServiceCatalogAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSServiceCatalogAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Service Catalog. A credentials provider
     * chain will be used that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Credential profiles file at the default location (~/.aws/credentials) shared by all AWS SDKs and the AWS CLI</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing a number of threads equal to the
     * maximum number of concurrent connections configured via {@code ClientConfiguration.getMaxConnections()}.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS Service Catalog (ex: proxy
     *        settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSServiceCatalogAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSServiceCatalogAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Service Catalog using the specified AWS
     * account credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSServiceCatalogAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSServiceCatalogAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Service Catalog using the specified AWS
     * account credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSServiceCatalogAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSServiceCatalogAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSServiceCatalogAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Service Catalog using the specified AWS
     * account credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSServiceCatalogAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSServiceCatalogAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSServiceCatalogAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSServiceCatalogAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Service Catalog using the specified AWS
     * account credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSServiceCatalogAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSServiceCatalogAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Service Catalog using the provided AWS
     * account credentials provider and client configuration options.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing a number of threads equal to the
     * maximum number of concurrent connections configured via {@code ClientConfiguration.getMaxConnections()}.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSServiceCatalogAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSServiceCatalogAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSServiceCatalogAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Service Catalog using the specified AWS
     * account credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSServiceCatalogAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSServiceCatalogAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSServiceCatalogAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Service Catalog using the specified AWS
     * account credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSServiceCatalogAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSServiceCatalogAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSServiceCatalogAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSServiceCatalogAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AWSServiceCatalogAsyncClientBuilder asyncBuilder() {
        return AWSServiceCatalogAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Service Catalog using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSServiceCatalogAsyncClient(AwsAsyncClientParams asyncClientParams) {
        super(asyncClientParams);
        this.executorService = asyncClientParams.getExecutor();
    }

    /**
     * Returns the executor service used by this client to execute async requests.
     *
     * @return The executor service used by this client to execute async requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<AcceptPortfolioShareResult> acceptPortfolioShareAsync(AcceptPortfolioShareRequest request) {

        return acceptPortfolioShareAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AcceptPortfolioShareResult> acceptPortfolioShareAsync(final AcceptPortfolioShareRequest request,
            final com.amazonaws.handlers.AsyncHandler<AcceptPortfolioShareRequest, AcceptPortfolioShareResult> asyncHandler) {
        final AcceptPortfolioShareRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AcceptPortfolioShareResult>() {
            @Override
            public AcceptPortfolioShareResult call() throws Exception {
                AcceptPortfolioShareResult result = null;

                try {
                    result = executeAcceptPortfolioShare(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AssociatePrincipalWithPortfolioResult> associatePrincipalWithPortfolioAsync(
            AssociatePrincipalWithPortfolioRequest request) {

        return associatePrincipalWithPortfolioAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociatePrincipalWithPortfolioResult> associatePrincipalWithPortfolioAsync(
            final AssociatePrincipalWithPortfolioRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociatePrincipalWithPortfolioRequest, AssociatePrincipalWithPortfolioResult> asyncHandler) {
        final AssociatePrincipalWithPortfolioRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociatePrincipalWithPortfolioResult>() {
            @Override
            public AssociatePrincipalWithPortfolioResult call() throws Exception {
                AssociatePrincipalWithPortfolioResult result = null;

                try {
                    result = executeAssociatePrincipalWithPortfolio(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AssociateProductWithPortfolioResult> associateProductWithPortfolioAsync(AssociateProductWithPortfolioRequest request) {

        return associateProductWithPortfolioAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateProductWithPortfolioResult> associateProductWithPortfolioAsync(
            final AssociateProductWithPortfolioRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateProductWithPortfolioRequest, AssociateProductWithPortfolioResult> asyncHandler) {
        final AssociateProductWithPortfolioRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateProductWithPortfolioResult>() {
            @Override
            public AssociateProductWithPortfolioResult call() throws Exception {
                AssociateProductWithPortfolioResult result = null;

                try {
                    result = executeAssociateProductWithPortfolio(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateConstraintResult> createConstraintAsync(CreateConstraintRequest request) {

        return createConstraintAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateConstraintResult> createConstraintAsync(final CreateConstraintRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateConstraintRequest, CreateConstraintResult> asyncHandler) {
        final CreateConstraintRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateConstraintResult>() {
            @Override
            public CreateConstraintResult call() throws Exception {
                CreateConstraintResult result = null;

                try {
                    result = executeCreateConstraint(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreatePortfolioResult> createPortfolioAsync(CreatePortfolioRequest request) {

        return createPortfolioAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePortfolioResult> createPortfolioAsync(final CreatePortfolioRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePortfolioRequest, CreatePortfolioResult> asyncHandler) {
        final CreatePortfolioRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePortfolioResult>() {
            @Override
            public CreatePortfolioResult call() throws Exception {
                CreatePortfolioResult result = null;

                try {
                    result = executeCreatePortfolio(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreatePortfolioShareResult> createPortfolioShareAsync(CreatePortfolioShareRequest request) {

        return createPortfolioShareAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePortfolioShareResult> createPortfolioShareAsync(final CreatePortfolioShareRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePortfolioShareRequest, CreatePortfolioShareResult> asyncHandler) {
        final CreatePortfolioShareRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePortfolioShareResult>() {
            @Override
            public CreatePortfolioShareResult call() throws Exception {
                CreatePortfolioShareResult result = null;

                try {
                    result = executeCreatePortfolioShare(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateProductResult> createProductAsync(CreateProductRequest request) {

        return createProductAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateProductResult> createProductAsync(final CreateProductRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateProductRequest, CreateProductResult> asyncHandler) {
        final CreateProductRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateProductResult>() {
            @Override
            public CreateProductResult call() throws Exception {
                CreateProductResult result = null;

                try {
                    result = executeCreateProduct(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateProvisioningArtifactResult> createProvisioningArtifactAsync(CreateProvisioningArtifactRequest request) {

        return createProvisioningArtifactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateProvisioningArtifactResult> createProvisioningArtifactAsync(final CreateProvisioningArtifactRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateProvisioningArtifactRequest, CreateProvisioningArtifactResult> asyncHandler) {
        final CreateProvisioningArtifactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateProvisioningArtifactResult>() {
            @Override
            public CreateProvisioningArtifactResult call() throws Exception {
                CreateProvisioningArtifactResult result = null;

                try {
                    result = executeCreateProvisioningArtifact(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteConstraintResult> deleteConstraintAsync(DeleteConstraintRequest request) {

        return deleteConstraintAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConstraintResult> deleteConstraintAsync(final DeleteConstraintRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteConstraintRequest, DeleteConstraintResult> asyncHandler) {
        final DeleteConstraintRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteConstraintResult>() {
            @Override
            public DeleteConstraintResult call() throws Exception {
                DeleteConstraintResult result = null;

                try {
                    result = executeDeleteConstraint(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeletePortfolioResult> deletePortfolioAsync(DeletePortfolioRequest request) {

        return deletePortfolioAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePortfolioResult> deletePortfolioAsync(final DeletePortfolioRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePortfolioRequest, DeletePortfolioResult> asyncHandler) {
        final DeletePortfolioRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePortfolioResult>() {
            @Override
            public DeletePortfolioResult call() throws Exception {
                DeletePortfolioResult result = null;

                try {
                    result = executeDeletePortfolio(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeletePortfolioShareResult> deletePortfolioShareAsync(DeletePortfolioShareRequest request) {

        return deletePortfolioShareAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePortfolioShareResult> deletePortfolioShareAsync(final DeletePortfolioShareRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePortfolioShareRequest, DeletePortfolioShareResult> asyncHandler) {
        final DeletePortfolioShareRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePortfolioShareResult>() {
            @Override
            public DeletePortfolioShareResult call() throws Exception {
                DeletePortfolioShareResult result = null;

                try {
                    result = executeDeletePortfolioShare(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteProductResult> deleteProductAsync(DeleteProductRequest request) {

        return deleteProductAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteProductResult> deleteProductAsync(final DeleteProductRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteProductRequest, DeleteProductResult> asyncHandler) {
        final DeleteProductRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteProductResult>() {
            @Override
            public DeleteProductResult call() throws Exception {
                DeleteProductResult result = null;

                try {
                    result = executeDeleteProduct(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteProvisioningArtifactResult> deleteProvisioningArtifactAsync(DeleteProvisioningArtifactRequest request) {

        return deleteProvisioningArtifactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteProvisioningArtifactResult> deleteProvisioningArtifactAsync(final DeleteProvisioningArtifactRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteProvisioningArtifactRequest, DeleteProvisioningArtifactResult> asyncHandler) {
        final DeleteProvisioningArtifactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteProvisioningArtifactResult>() {
            @Override
            public DeleteProvisioningArtifactResult call() throws Exception {
                DeleteProvisioningArtifactResult result = null;

                try {
                    result = executeDeleteProvisioningArtifact(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeConstraintResult> describeConstraintAsync(DescribeConstraintRequest request) {

        return describeConstraintAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConstraintResult> describeConstraintAsync(final DescribeConstraintRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeConstraintRequest, DescribeConstraintResult> asyncHandler) {
        final DescribeConstraintRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeConstraintResult>() {
            @Override
            public DescribeConstraintResult call() throws Exception {
                DescribeConstraintResult result = null;

                try {
                    result = executeDescribeConstraint(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribePortfolioResult> describePortfolioAsync(DescribePortfolioRequest request) {

        return describePortfolioAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePortfolioResult> describePortfolioAsync(final DescribePortfolioRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePortfolioRequest, DescribePortfolioResult> asyncHandler) {
        final DescribePortfolioRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribePortfolioResult>() {
            @Override
            public DescribePortfolioResult call() throws Exception {
                DescribePortfolioResult result = null;

                try {
                    result = executeDescribePortfolio(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeProductResult> describeProductAsync(DescribeProductRequest request) {

        return describeProductAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeProductResult> describeProductAsync(final DescribeProductRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeProductRequest, DescribeProductResult> asyncHandler) {
        final DescribeProductRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeProductResult>() {
            @Override
            public DescribeProductResult call() throws Exception {
                DescribeProductResult result = null;

                try {
                    result = executeDescribeProduct(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeProductAsAdminResult> describeProductAsAdminAsync(DescribeProductAsAdminRequest request) {

        return describeProductAsAdminAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeProductAsAdminResult> describeProductAsAdminAsync(final DescribeProductAsAdminRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeProductAsAdminRequest, DescribeProductAsAdminResult> asyncHandler) {
        final DescribeProductAsAdminRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeProductAsAdminResult>() {
            @Override
            public DescribeProductAsAdminResult call() throws Exception {
                DescribeProductAsAdminResult result = null;

                try {
                    result = executeDescribeProductAsAdmin(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeProductViewResult> describeProductViewAsync(DescribeProductViewRequest request) {

        return describeProductViewAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeProductViewResult> describeProductViewAsync(final DescribeProductViewRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeProductViewRequest, DescribeProductViewResult> asyncHandler) {
        final DescribeProductViewRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeProductViewResult>() {
            @Override
            public DescribeProductViewResult call() throws Exception {
                DescribeProductViewResult result = null;

                try {
                    result = executeDescribeProductView(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeProvisioningArtifactResult> describeProvisioningArtifactAsync(DescribeProvisioningArtifactRequest request) {

        return describeProvisioningArtifactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeProvisioningArtifactResult> describeProvisioningArtifactAsync(final DescribeProvisioningArtifactRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeProvisioningArtifactRequest, DescribeProvisioningArtifactResult> asyncHandler) {
        final DescribeProvisioningArtifactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeProvisioningArtifactResult>() {
            @Override
            public DescribeProvisioningArtifactResult call() throws Exception {
                DescribeProvisioningArtifactResult result = null;

                try {
                    result = executeDescribeProvisioningArtifact(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeProvisioningParametersResult> describeProvisioningParametersAsync(DescribeProvisioningParametersRequest request) {

        return describeProvisioningParametersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeProvisioningParametersResult> describeProvisioningParametersAsync(
            final DescribeProvisioningParametersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeProvisioningParametersRequest, DescribeProvisioningParametersResult> asyncHandler) {
        final DescribeProvisioningParametersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeProvisioningParametersResult>() {
            @Override
            public DescribeProvisioningParametersResult call() throws Exception {
                DescribeProvisioningParametersResult result = null;

                try {
                    result = executeDescribeProvisioningParameters(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeRecordResult> describeRecordAsync(DescribeRecordRequest request) {

        return describeRecordAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRecordResult> describeRecordAsync(final DescribeRecordRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRecordRequest, DescribeRecordResult> asyncHandler) {
        final DescribeRecordRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeRecordResult>() {
            @Override
            public DescribeRecordResult call() throws Exception {
                DescribeRecordResult result = null;

                try {
                    result = executeDescribeRecord(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociatePrincipalFromPortfolioResult> disassociatePrincipalFromPortfolioAsync(
            DisassociatePrincipalFromPortfolioRequest request) {

        return disassociatePrincipalFromPortfolioAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociatePrincipalFromPortfolioResult> disassociatePrincipalFromPortfolioAsync(
            final DisassociatePrincipalFromPortfolioRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociatePrincipalFromPortfolioRequest, DisassociatePrincipalFromPortfolioResult> asyncHandler) {
        final DisassociatePrincipalFromPortfolioRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociatePrincipalFromPortfolioResult>() {
            @Override
            public DisassociatePrincipalFromPortfolioResult call() throws Exception {
                DisassociatePrincipalFromPortfolioResult result = null;

                try {
                    result = executeDisassociatePrincipalFromPortfolio(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateProductFromPortfolioResult> disassociateProductFromPortfolioAsync(
            DisassociateProductFromPortfolioRequest request) {

        return disassociateProductFromPortfolioAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateProductFromPortfolioResult> disassociateProductFromPortfolioAsync(
            final DisassociateProductFromPortfolioRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateProductFromPortfolioRequest, DisassociateProductFromPortfolioResult> asyncHandler) {
        final DisassociateProductFromPortfolioRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateProductFromPortfolioResult>() {
            @Override
            public DisassociateProductFromPortfolioResult call() throws Exception {
                DisassociateProductFromPortfolioResult result = null;

                try {
                    result = executeDisassociateProductFromPortfolio(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAcceptedPortfolioSharesResult> listAcceptedPortfolioSharesAsync(ListAcceptedPortfolioSharesRequest request) {

        return listAcceptedPortfolioSharesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAcceptedPortfolioSharesResult> listAcceptedPortfolioSharesAsync(final ListAcceptedPortfolioSharesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAcceptedPortfolioSharesRequest, ListAcceptedPortfolioSharesResult> asyncHandler) {
        final ListAcceptedPortfolioSharesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAcceptedPortfolioSharesResult>() {
            @Override
            public ListAcceptedPortfolioSharesResult call() throws Exception {
                ListAcceptedPortfolioSharesResult result = null;

                try {
                    result = executeListAcceptedPortfolioShares(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListConstraintsForPortfolioResult> listConstraintsForPortfolioAsync(ListConstraintsForPortfolioRequest request) {

        return listConstraintsForPortfolioAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListConstraintsForPortfolioResult> listConstraintsForPortfolioAsync(final ListConstraintsForPortfolioRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListConstraintsForPortfolioRequest, ListConstraintsForPortfolioResult> asyncHandler) {
        final ListConstraintsForPortfolioRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListConstraintsForPortfolioResult>() {
            @Override
            public ListConstraintsForPortfolioResult call() throws Exception {
                ListConstraintsForPortfolioResult result = null;

                try {
                    result = executeListConstraintsForPortfolio(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListLaunchPathsResult> listLaunchPathsAsync(ListLaunchPathsRequest request) {

        return listLaunchPathsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLaunchPathsResult> listLaunchPathsAsync(final ListLaunchPathsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListLaunchPathsRequest, ListLaunchPathsResult> asyncHandler) {
        final ListLaunchPathsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListLaunchPathsResult>() {
            @Override
            public ListLaunchPathsResult call() throws Exception {
                ListLaunchPathsResult result = null;

                try {
                    result = executeListLaunchPaths(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListPortfolioAccessResult> listPortfolioAccessAsync(ListPortfolioAccessRequest request) {

        return listPortfolioAccessAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPortfolioAccessResult> listPortfolioAccessAsync(final ListPortfolioAccessRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPortfolioAccessRequest, ListPortfolioAccessResult> asyncHandler) {
        final ListPortfolioAccessRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPortfolioAccessResult>() {
            @Override
            public ListPortfolioAccessResult call() throws Exception {
                ListPortfolioAccessResult result = null;

                try {
                    result = executeListPortfolioAccess(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListPortfoliosResult> listPortfoliosAsync(ListPortfoliosRequest request) {

        return listPortfoliosAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPortfoliosResult> listPortfoliosAsync(final ListPortfoliosRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPortfoliosRequest, ListPortfoliosResult> asyncHandler) {
        final ListPortfoliosRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPortfoliosResult>() {
            @Override
            public ListPortfoliosResult call() throws Exception {
                ListPortfoliosResult result = null;

                try {
                    result = executeListPortfolios(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListPortfoliosForProductResult> listPortfoliosForProductAsync(ListPortfoliosForProductRequest request) {

        return listPortfoliosForProductAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPortfoliosForProductResult> listPortfoliosForProductAsync(final ListPortfoliosForProductRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPortfoliosForProductRequest, ListPortfoliosForProductResult> asyncHandler) {
        final ListPortfoliosForProductRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPortfoliosForProductResult>() {
            @Override
            public ListPortfoliosForProductResult call() throws Exception {
                ListPortfoliosForProductResult result = null;

                try {
                    result = executeListPortfoliosForProduct(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListPrincipalsForPortfolioResult> listPrincipalsForPortfolioAsync(ListPrincipalsForPortfolioRequest request) {

        return listPrincipalsForPortfolioAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPrincipalsForPortfolioResult> listPrincipalsForPortfolioAsync(final ListPrincipalsForPortfolioRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPrincipalsForPortfolioRequest, ListPrincipalsForPortfolioResult> asyncHandler) {
        final ListPrincipalsForPortfolioRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPrincipalsForPortfolioResult>() {
            @Override
            public ListPrincipalsForPortfolioResult call() throws Exception {
                ListPrincipalsForPortfolioResult result = null;

                try {
                    result = executeListPrincipalsForPortfolio(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListProvisioningArtifactsResult> listProvisioningArtifactsAsync(ListProvisioningArtifactsRequest request) {

        return listProvisioningArtifactsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProvisioningArtifactsResult> listProvisioningArtifactsAsync(final ListProvisioningArtifactsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListProvisioningArtifactsRequest, ListProvisioningArtifactsResult> asyncHandler) {
        final ListProvisioningArtifactsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListProvisioningArtifactsResult>() {
            @Override
            public ListProvisioningArtifactsResult call() throws Exception {
                ListProvisioningArtifactsResult result = null;

                try {
                    result = executeListProvisioningArtifacts(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListRecordHistoryResult> listRecordHistoryAsync(ListRecordHistoryRequest request) {

        return listRecordHistoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRecordHistoryResult> listRecordHistoryAsync(final ListRecordHistoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRecordHistoryRequest, ListRecordHistoryResult> asyncHandler) {
        final ListRecordHistoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRecordHistoryResult>() {
            @Override
            public ListRecordHistoryResult call() throws Exception {
                ListRecordHistoryResult result = null;

                try {
                    result = executeListRecordHistory(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ProvisionProductResult> provisionProductAsync(ProvisionProductRequest request) {

        return provisionProductAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ProvisionProductResult> provisionProductAsync(final ProvisionProductRequest request,
            final com.amazonaws.handlers.AsyncHandler<ProvisionProductRequest, ProvisionProductResult> asyncHandler) {
        final ProvisionProductRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ProvisionProductResult>() {
            @Override
            public ProvisionProductResult call() throws Exception {
                ProvisionProductResult result = null;

                try {
                    result = executeProvisionProduct(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RejectPortfolioShareResult> rejectPortfolioShareAsync(RejectPortfolioShareRequest request) {

        return rejectPortfolioShareAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RejectPortfolioShareResult> rejectPortfolioShareAsync(final RejectPortfolioShareRequest request,
            final com.amazonaws.handlers.AsyncHandler<RejectPortfolioShareRequest, RejectPortfolioShareResult> asyncHandler) {
        final RejectPortfolioShareRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RejectPortfolioShareResult>() {
            @Override
            public RejectPortfolioShareResult call() throws Exception {
                RejectPortfolioShareResult result = null;

                try {
                    result = executeRejectPortfolioShare(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ScanProvisionedProductsResult> scanProvisionedProductsAsync(ScanProvisionedProductsRequest request) {

        return scanProvisionedProductsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ScanProvisionedProductsResult> scanProvisionedProductsAsync(final ScanProvisionedProductsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ScanProvisionedProductsRequest, ScanProvisionedProductsResult> asyncHandler) {
        final ScanProvisionedProductsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ScanProvisionedProductsResult>() {
            @Override
            public ScanProvisionedProductsResult call() throws Exception {
                ScanProvisionedProductsResult result = null;

                try {
                    result = executeScanProvisionedProducts(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SearchProductsResult> searchProductsAsync(SearchProductsRequest request) {

        return searchProductsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchProductsResult> searchProductsAsync(final SearchProductsRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchProductsRequest, SearchProductsResult> asyncHandler) {
        final SearchProductsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchProductsResult>() {
            @Override
            public SearchProductsResult call() throws Exception {
                SearchProductsResult result = null;

                try {
                    result = executeSearchProducts(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SearchProductsAsAdminResult> searchProductsAsAdminAsync(SearchProductsAsAdminRequest request) {

        return searchProductsAsAdminAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchProductsAsAdminResult> searchProductsAsAdminAsync(final SearchProductsAsAdminRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchProductsAsAdminRequest, SearchProductsAsAdminResult> asyncHandler) {
        final SearchProductsAsAdminRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchProductsAsAdminResult>() {
            @Override
            public SearchProductsAsAdminResult call() throws Exception {
                SearchProductsAsAdminResult result = null;

                try {
                    result = executeSearchProductsAsAdmin(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<TerminateProvisionedProductResult> terminateProvisionedProductAsync(TerminateProvisionedProductRequest request) {

        return terminateProvisionedProductAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TerminateProvisionedProductResult> terminateProvisionedProductAsync(final TerminateProvisionedProductRequest request,
            final com.amazonaws.handlers.AsyncHandler<TerminateProvisionedProductRequest, TerminateProvisionedProductResult> asyncHandler) {
        final TerminateProvisionedProductRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TerminateProvisionedProductResult>() {
            @Override
            public TerminateProvisionedProductResult call() throws Exception {
                TerminateProvisionedProductResult result = null;

                try {
                    result = executeTerminateProvisionedProduct(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateConstraintResult> updateConstraintAsync(UpdateConstraintRequest request) {

        return updateConstraintAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateConstraintResult> updateConstraintAsync(final UpdateConstraintRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateConstraintRequest, UpdateConstraintResult> asyncHandler) {
        final UpdateConstraintRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateConstraintResult>() {
            @Override
            public UpdateConstraintResult call() throws Exception {
                UpdateConstraintResult result = null;

                try {
                    result = executeUpdateConstraint(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdatePortfolioResult> updatePortfolioAsync(UpdatePortfolioRequest request) {

        return updatePortfolioAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePortfolioResult> updatePortfolioAsync(final UpdatePortfolioRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdatePortfolioRequest, UpdatePortfolioResult> asyncHandler) {
        final UpdatePortfolioRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdatePortfolioResult>() {
            @Override
            public UpdatePortfolioResult call() throws Exception {
                UpdatePortfolioResult result = null;

                try {
                    result = executeUpdatePortfolio(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateProductResult> updateProductAsync(UpdateProductRequest request) {

        return updateProductAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateProductResult> updateProductAsync(final UpdateProductRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateProductRequest, UpdateProductResult> asyncHandler) {
        final UpdateProductRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateProductResult>() {
            @Override
            public UpdateProductResult call() throws Exception {
                UpdateProductResult result = null;

                try {
                    result = executeUpdateProduct(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateProvisionedProductResult> updateProvisionedProductAsync(UpdateProvisionedProductRequest request) {

        return updateProvisionedProductAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateProvisionedProductResult> updateProvisionedProductAsync(final UpdateProvisionedProductRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateProvisionedProductRequest, UpdateProvisionedProductResult> asyncHandler) {
        final UpdateProvisionedProductRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateProvisionedProductResult>() {
            @Override
            public UpdateProvisionedProductResult call() throws Exception {
                UpdateProvisionedProductResult result = null;

                try {
                    result = executeUpdateProvisionedProduct(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateProvisioningArtifactResult> updateProvisioningArtifactAsync(UpdateProvisioningArtifactRequest request) {

        return updateProvisioningArtifactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateProvisioningArtifactResult> updateProvisioningArtifactAsync(final UpdateProvisioningArtifactRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateProvisioningArtifactRequest, UpdateProvisioningArtifactResult> asyncHandler) {
        final UpdateProvisioningArtifactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateProvisioningArtifactResult>() {
            @Override
            public UpdateProvisioningArtifactResult call() throws Exception {
                UpdateProvisioningArtifactResult result = null;

                try {
                    result = executeUpdateProvisioningArtifact(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
     * asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by {@code getExecutorService().awaitTermination()} prior to
     * calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
}
