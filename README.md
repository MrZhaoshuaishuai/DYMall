# DYMall
字节青训营抖音商城项目
├─pom.xml
├─user-service
|      ├─pom.xml
|      ├─target
|      ├─src
|      |  ├─test
|      |  |  ├─java
|      |  ├─main
|      |  |  ├─resources
|      |  |  |     ├─application-dev.yaml
|      |  |  |     ├─application-local.yaml
|      |  |  |     ├─application.yaml
|      |  |  |     └dmall.jks
|      |  |  ├─java
|      |  |  |  ├─com
|      |  |  |  |  ├─dmall
|      |  |  |  |  |   ├─user
|      |  |  |  |  |   |  ├─UserApplication.java
|      |  |  |  |  |   |  ├─util
|      |  |  |  |  |   |  |  └JwtTool.java
|      |  |  |  |  |   |  ├─service
|      |  |  |  |  |   |  |    ├─IAddressService.java
|      |  |  |  |  |   |  |    ├─IUserService.java
|      |  |  |  |  |   |  |    ├─impl
|      |  |  |  |  |   |  |    |  ├─AddressServiceImpl.java
|      |  |  |  |  |   |  |    |  └UserServiceImpl.java
|      |  |  |  |  |   |  ├─mapper
|      |  |  |  |  |   |  |   ├─AddressMapper.java
|      |  |  |  |  |   |  |   └UserMapper.java
|      |  |  |  |  |   |  ├─enums
|      |  |  |  |  |   |  |   └UserStatus.java
|      |  |  |  |  |   |  ├─domain
|      |  |  |  |  |   |  |   ├─vo
|      |  |  |  |  |   |  |   | └UserLoginVO.java
|      |  |  |  |  |   |  |   ├─po
|      |  |  |  |  |   |  |   | ├─Address.java
|      |  |  |  |  |   |  |   | └User.java
|      |  |  |  |  |   |  |   ├─dto
|      |  |  |  |  |   |  |   |  ├─AddressDTO.java
|      |  |  |  |  |   |  |   |  └LoginFormDTO.java
|      |  |  |  |  |   |  ├─controller
|      |  |  |  |  |   |  |     ├─AddressController.java
|      |  |  |  |  |   |  |     └UserController.java
|      |  |  |  |  |   |  ├─config
|      |  |  |  |  |   |  |   ├─JwtProperties.java
|      |  |  |  |  |   |  |   └SecurityConfig.java
├─trade-service
|       ├─pom.xml
|       ├─target
|       ├─src
|       |  ├─test
|       |  |  ├─java
|       |  ├─main
|       |  |  ├─resources
|       |  |  |     ├─application-dev.yaml
|       |  |  |     ├─application-local.yaml
|       |  |  |     └application.yaml
|       |  |  ├─java
|       |  |  |  ├─com
|       |  |  |  |  ├─dmall
|       |  |  |  |  |   ├─trade
|       |  |  |  |  |   |   ├─TradeApplication.java
|       |  |  |  |  |   |   ├─service
|       |  |  |  |  |   |   |    ├─IOrderDetailService.java
|       |  |  |  |  |   |   |    ├─IOrderLogisticsService.java
|       |  |  |  |  |   |   |    ├─IOrderService.java
|       |  |  |  |  |   |   |    ├─impl
|       |  |  |  |  |   |   |    |  ├─OrderDetailServiceImpl.java
|       |  |  |  |  |   |   |    |  ├─OrderLogisticsServiceImpl.java
|       |  |  |  |  |   |   |    |  └OrderServiceImpl.java
|       |  |  |  |  |   |   ├─mapper
|       |  |  |  |  |   |   |   ├─OrderDetailMapper.java
|       |  |  |  |  |   |   |   ├─OrderLogisticsMapper.java
|       |  |  |  |  |   |   |   └OrderMapper.java
|       |  |  |  |  |   |   ├─listener
|       |  |  |  |  |   |   |    └PayStatusListener.java
|       |  |  |  |  |   |   ├─domain
|       |  |  |  |  |   |   |   ├─vo
|       |  |  |  |  |   |   |   | └OrderVO.java
|       |  |  |  |  |   |   |   ├─po
|       |  |  |  |  |   |   |   | ├─Order.java
|       |  |  |  |  |   |   |   | ├─OrderDetail.java
|       |  |  |  |  |   |   |   | └OrderLogistics.java
|       |  |  |  |  |   |   |   ├─dto
|       |  |  |  |  |   |   |   |  └OrderFormDTO.java
|       |  |  |  |  |   |   ├─controller
|       |  |  |  |  |   |   |     └OrderController.java
├─pay-service
|      ├─pom.xml
|      ├─target
|      ├─src
|      |  ├─test
|      |  |  ├─java
|      |  ├─main
|      |  |  ├─resources
|      |  |  |     ├─application-dev.yaml
|      |  |  |     ├─application-local.yaml
|      |  |  |     └application.yaml
|      |  |  ├─java
|      |  |  |  ├─com
|      |  |  |  |  ├─dmall
|      |  |  |  |  |   ├─pay
|      |  |  |  |  |   |  ├─PayApplication.java
|      |  |  |  |  |   |  ├─service
|      |  |  |  |  |   |  |    ├─IPayOrderService.java
|      |  |  |  |  |   |  |    ├─impl
|      |  |  |  |  |   |  |    |  └PayOrderServiceImpl.java
|      |  |  |  |  |   |  ├─mapper
|      |  |  |  |  |   |  |   └PayOrderMapper.java
|      |  |  |  |  |   |  ├─enums
|      |  |  |  |  |   |  |   ├─PayChannel.java
|      |  |  |  |  |   |  |   ├─PayStatus.java
|      |  |  |  |  |   |  |   └PayType.java
|      |  |  |  |  |   |  ├─domain
|      |  |  |  |  |   |  |   ├─vo
|      |  |  |  |  |   |  |   | └PayOrderVO.java
|      |  |  |  |  |   |  |   ├─po
|      |  |  |  |  |   |  |   | └PayOrder.java
|      |  |  |  |  |   |  |   ├─dto
|      |  |  |  |  |   |  |   |  ├─PayApplyDTO.java
|      |  |  |  |  |   |  |   |  └PayOrderFormDTO.java
|      |  |  |  |  |   |  ├─controller
|      |  |  |  |  |   |  |     └PayController.java
├─logs
├─item-service
|      ├─pom.xml
|      ├─target
|      ├─src
|      |  ├─test
|      |  |  ├─java
|      |  ├─main
|      |  |  ├─resources
|      |  |  |     ├─application-dev.yaml
|      |  |  |     ├─application-local.yaml
|      |  |  |     └application.yaml
|      |  |  ├─java
|      |  |  |  ├─com
|      |  |  |  |  ├─dmall
|      |  |  |  |  |   ├─item
|      |  |  |  |  |   |  ├─ItemApplication.java
|      |  |  |  |  |   |  ├─service
|      |  |  |  |  |   |  |    ├─IItemService.java
|      |  |  |  |  |   |  |    ├─impl
|      |  |  |  |  |   |  |    |  └ItemServiceImpl.java
|      |  |  |  |  |   |  ├─mapper
|      |  |  |  |  |   |  |   └ItemMapper.java
|      |  |  |  |  |   |  ├─domain
|      |  |  |  |  |   |  |   ├─query
|      |  |  |  |  |   |  |   |   └ItemPageQuery.java
|      |  |  |  |  |   |  |   ├─po
|      |  |  |  |  |   |  |   | └Item.java
|      |  |  |  |  |   |  |   ├─dto
|      |  |  |  |  |   |  |   |  ├─ItemDTO.java
|      |  |  |  |  |   |  |   |  └OrderDetailDTO.java
|      |  |  |  |  |   |  ├─controller
|      |  |  |  |  |   |  |     ├─ItemController.java
|      |  |  |  |  |   |  |     └SearchController.java
├─dm-gateway
|     ├─pom.xml
|     ├─target
|     ├─src
|     |  ├─test
|     |  |  ├─java
|     |  ├─main
|     |  |  ├─resources
|     |  |  |     ├─application.yaml
|     |  |  |     └dmall.jks
|     |  |  ├─java
|     |  |  |  ├─com
|     |  |  |  |  ├─dmall
|     |  |  |  |  |   ├─gateway
|     |  |  |  |  |   |    ├─GatewayApplication.java
|     |  |  |  |  |   |    ├─util
|     |  |  |  |  |   |    |  └JwtTool.java
|     |  |  |  |  |   |    ├─filter
|     |  |  |  |  |   |    |   └AuthGlobalFilter.java
|     |  |  |  |  |   |    ├─config
|     |  |  |  |  |   |    |   ├─AuthProperties.java
|     |  |  |  |  |   |    |   ├─JwtProperties.java
|     |  |  |  |  |   |    |   └SecurityConfig.java
├─dm-common
|     ├─pom.xml
|     ├─target
|     ├─src
|     |  ├─test
|     |  |  ├─java
|     |  ├─main
|     |  |  ├─resources
|     |  |  |     ├─META-INF
|     |  |  |     |    ├─spring-configuration-metadata.json
|     |  |  |     |    └spring.factories
|     |  |  ├─java
|     |  |  |  ├─com
|     |  |  |  |  ├─dmall
|     |  |  |  |  |   ├─common
|     |  |  |  |  |   |   ├─utils
|     |  |  |  |  |   |   |   ├─BeanUtils.java
|     |  |  |  |  |   |   |   ├─CollUtils.java
|     |  |  |  |  |   |   |   ├─Convert.java
|     |  |  |  |  |   |   |   ├─CookieBuilder.java
|     |  |  |  |  |   |   |   ├─UserContext.java
|     |  |  |  |  |   |   |   └WebUtils.java
|     |  |  |  |  |   |   ├─interceptor
|     |  |  |  |  |   |   |      └UserInfoInterceptor.java
|     |  |  |  |  |   |   ├─exception
|     |  |  |  |  |   |   |     ├─BadRequestException.java
|     |  |  |  |  |   |   |     ├─BizIllegalException.java
|     |  |  |  |  |   |   |     ├─CommonException.java
|     |  |  |  |  |   |   |     ├─DbException.java
|     |  |  |  |  |   |   |     ├─ForbiddenException.java
|     |  |  |  |  |   |   |     └UnauthorizedException.java
|     |  |  |  |  |   |   ├─domain
|     |  |  |  |  |   |   |   ├─PageDTO.java
|     |  |  |  |  |   |   |   ├─PageQuery.java
|     |  |  |  |  |   |   |   └R.java
|     |  |  |  |  |   |   ├─config
|     |  |  |  |  |   |   |   ├─JsonConfig.java
|     |  |  |  |  |   |   |   ├─MvcConfig.java
|     |  |  |  |  |   |   |   └MyBatisConfig.java
|     |  |  |  |  |   |   ├─advice
|     |  |  |  |  |   |   |   └CommonExceptionAdvice.java
├─dm-api
|   ├─pom.xml
|   ├─target
|   ├─src
|   |  ├─test
|   |  |  ├─java
|   |  ├─main
|   |  |  ├─resources
|   |  |  ├─java
|   |  |  |  ├─com
|   |  |  |  |  ├─dmall
|   |  |  |  |  |   ├─api
|   |  |  |  |  |   |  ├─dto
|   |  |  |  |  |   |  |  ├─ItemDTO.java
|   |  |  |  |  |   |  |  └OrderDetailDTO.java
|   |  |  |  |  |   |  ├─config
|   |  |  |  |  |   |  |   └DefaultFeignConfig.java
|   |  |  |  |  |   |  ├─client
|   |  |  |  |  |   |  |   ├─CartClient.java
|   |  |  |  |  |   |  |   ├─ItemClient.java
|   |  |  |  |  |   |  |   ├─TradeClient.java
|   |  |  |  |  |   |  |   └UserClient.java
├─cart-service
|      ├─pom.xml
|      ├─target
|      ├─src
|      |  ├─test
|      |  |  ├─java
|      |  ├─main
|      |  |  ├─resources
|      |  |  |     ├─application-dev.yaml
|      |  |  |     ├─application-local.yaml
|      |  |  |     └application.yaml
|      |  |  ├─java
|      |  |  |  ├─com
|      |  |  |  |  ├─dmall
|      |  |  |  |  |   ├─cart
|      |  |  |  |  |   |  ├─CartApplication.java
|      |  |  |  |  |   |  ├─service
|      |  |  |  |  |   |  |    ├─ICartService.java
|      |  |  |  |  |   |  |    ├─impl
|      |  |  |  |  |   |  |    |  └CartServiceImpl.java
|      |  |  |  |  |   |  ├─mapper
|      |  |  |  |  |   |  |   └CartMapper.java
|      |  |  |  |  |   |  ├─domain
|      |  |  |  |  |   |  |   ├─vo
|      |  |  |  |  |   |  |   | └CartVO.java
|      |  |  |  |  |   |  |   ├─po
|      |  |  |  |  |   |  |   | └Cart.java
|      |  |  |  |  |   |  |   ├─dto
|      |  |  |  |  |   |  |   |  ├─CartFormDTO.java
|      |  |  |  |  |   |  |   |  └ItemDTO.java
|      |  |  |  |  |   |  ├─controller
|      |  |  |  |  |   |  |     └CartController.java
├─.idea
|   ├─.gitignore
|   ├─compiler.xml
|   ├─dataSources.local.xml
|   ├─dataSources.xml
|   ├─dmall.iml
|   ├─encodings.xml
|   ├─jarRepositories.xml
|   ├─misc.xml
|   ├─sqldialects.xml
|   ├─uiDesigner.xml
|   ├─workspace.xml
|   ├─dataSources
|   |      ├─78757fc5-5d39-41ae-97f1-3a56b0d26644.xml
|   |      ├─78757fc5-5d39-41ae-97f1-3a56b0d26644
|   |      |                  ├─storage_v2
|   |      |                  |     ├─_src_
|   |      |                  |     |   ├─schema
|   |      |                  |     |   |   ├─dm-cart.5P2XZg.meta
|   |      |                  |     |   |   ├─dm-item.1_2aZg.meta
|   |      |                  |     |   |   ├─dm-pay.ZMW6sA.meta
|   |      |                  |     |   |   ├─dm-trade.IMdebQ.meta
|   |      |                  |     |   |   ├─dm-user.j26gZg.meta
|   |      |                  |     |   |   ├─dmall.eDS0BQ.meta
|   |      |                  |     |   |   ├─dymall.KcCAsQ.meta
|   |      |                  |     |   |   ├─hmall.fJLsBQ.meta
|   |      |                  |     |   |   ├─information_schema.FNRwLQ.meta
|   |      |                  |     |   |   ├─mysql.osA4Bg.meta
|   |      |                  |     |   |   ├─nacos.9LI7Bg.meta
|   |      |                  |     |   |   ├─performance_schema.kIw0nw.meta
|   |      |                  |     |   |   ├─seata._PKDBg.meta
|   |      |                  |     |   |   └sys.zb4BAA.meta

