# bm-elife-api-sdk
千米网-E生活API文档

OpenClient类为SDK的入口类，其实现类为DefaultOpenClient
RechargeBaseGetItemInfoRequest为API请求参数的封装类
RechargeBaseGetItemInfoResponse为API请求返回结果的封装类
更多API调用示例，请看API文档中的SDK调用示例

```java
import com.qianmi.open.api.ApiException;
import com.qianmi.open.api.DefaultOpenClient;
import com.qianmi.open.api.OpenClient;
import com.qianmi.open.api.request.RechargeBaseGetItemInfoRequest;
import com.qianmi.open.api.response.RechargeBaseGetItemInfoResponse;

public class ApiDemo {

	protected static String serverUrl = "http://gw.api.qianmi.com/api";
	protected static String appKey = "test";
	protected static String appSecret = "test";
	protected static String acceessToken = "test";
	
	public void testGetItemInfo()  {
		OpenClient client = new DefaultOpenClient(serverUrl, appKey, appSecret);
		RechargeBaseGetItemInfoRequest req = new RechargeBaseGetItemInfoRequest();
		req.setItemId("140600");
		try {
			RechargeBaseGetItemInfoResponse response=client.execute(req,acceessToken);
			System.out.println(response.getItemInfo().getItemName());
		} catch (ApiException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new ApiDemo().testGetItemInfo();
	}

}
```


PS: 连个maven都没 自力更生丰衣足食下

## maven配置

```xml
		<dependency>
			<groupId>com.qianmi</groupId>
			<artifactId>bm-elife-api-sdk</artifactId>
			<version>1.0.0-SNAPSHOT</version>
		</dependency>
```

快照库地址

```xml
	<repositories>
		<repository>
			<id>nutz-snapshots</id>
			<url>https://jfrog.nutz.cn/artifactory/snapshots</url>
			<snapshots>
				<enabled>true</enabled>
				<updatePolicy>always</updatePolicy>
			</snapshots>
			<releases>
				<enabled>false</enabled>
			</releases>
		</repository>
	</repositories>
```