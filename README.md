<h1>E-commerce-App-Micro-Services-Spring-Angular</h1>
<h1>I. Backend</h1>
<h2 dir="auto"><a id="user-content-1-the-use-case" class="anchor" aria-hidden="true" href="#1-the-use-case"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>1. <a name="user-content-theusecase"></a>The use case</h2>
<img src="https://github.com/TarikFERTAHI/E-commerce-App-Micro-Services-Spring-Angular/blob/main/pics/01 - Copy.png">
<p dir="auto">Just to make thing easy to navigate between the microservices without the need to open a new window for each one we can in Intellij Idea</p>
<ol dir="auto">
<li><code>create a project </code> (empty one).</li>
<li>Add the projects as modules to the empty project <code>Add new Module from existing source</code>.</li>
</ol>
<img src="https://github.com/TarikFERTAHI/E-commerce-App-Micro-Services-Spring-Angular/blob/main/pics/projectStr.png">
<h2 dir="auto"><a id="user-content-2-technical-services" class="anchor" aria-hidden="true" href="#2-technical-services"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>2. <a name="user-content-technicalservices"></a>Technical services</h2>
<h3 dir="auto"><a id="user-content-21-consul-discovery-service" class="anchor" aria-hidden="true" href="#21-consul-discovery-service"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>2.1. <a name="user-content-consuldiscoveryservice"></a>Consul Discovery service</h3>
<p dir="auto">We will create it as a micro-service, because it is available as a <code>jar</code> executable file.</p>

<ul dir="auto">
<li>
<p dir="auto">Website : <a href="https://www.consul.io/" rel="nofollow">https://www.consul.io/</a></p>
</li>
<li>
<p dir="auto">As jar file [v1.13.3 (latest version 2022-11-06)]: <a href="https://releases.hashicorp.com/consul/1.13.3/consul_1.13.3_windows_386.zip" rel="nofollow">https://releases.hashicorp.com/consul/1.13.3/consul_1.13.3_windows_386.zip</a></p>
</li>
</ul>
<div class="zeroclipboard-container position-absolute right-0 top-0">
    <clipboard-copy aria-label="Copy" class="ClipboardButton btn js-clipboard-copy m-2 p-0 tooltipped-no-delay" data-copy-feedback="Copied!" data-tooltip-direction="w" value="$ docker run -d -p 8500:8500 -p 8600:8600/udp --name=my-consul consul agent -server -ui -node=server-1 -bootstrap-expect=1 -client=0.0.0.0
" tabindex="0" role="button">
      <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-copy js-clipboard-copy-icon m-2">
    <path fill-rule="evenodd" d="M0 6.75C0 5.784.784 5 1.75 5h1.5a.75.75 0 010 1.5h-1.5a.25.25 0 00-.25.25v7.5c0 .138.112.25.25.25h7.5a.25.25 0 00.25-.25v-1.5a.75.75 0 011.5 0v1.5A1.75 1.75 0 019.25 16h-7.5A1.75 1.75 0 010 14.25v-7.5z"></path><path fill-rule="evenodd" d="M5 1.75C5 .784 5.784 0 6.75 0h7.5C15.216 0 16 .784 16 1.75v7.5A1.75 1.75 0 0114.25 11h-7.5A1.75 1.75 0 015 9.25v-7.5zm1.75-.25a.25.25 0 00-.25.25v7.5c0 .138.112.25.25.25h7.5a.25.25 0 00.25-.25v-7.5a.25.25 0 00-.25-.25h-7.5z"></path>
</svg>
      <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-check js-clipboard-check-icon color-fg-success d-none m-2">
    <path fill-rule="evenodd" d="M13.78 4.22a.75.75 0 010 1.06l-7.25 7.25a.75.75 0 01-1.06 0L2.22 9.28a.75.75 0 011.06-1.06L6 10.94l6.72-6.72a.75.75 0 011.06 0z"></path>
</svg>
    </clipboard-copy>
  </div></div>
  <ul dir="auto">
<li>Command to Run Consul :<code>consul agent -server -bootstrap-expect=1 -data-dir=consul-data -ui -bind=192.168.244.133</code>
</ul>
  <ul dir="auto">
<li>Visiting <code>http://localhost:8500</code> (<code>http://localhost:8500/ui/dc1/services</code>)</li>
</ul>
<img src="https://github.com/TarikFERTAHI/E-commerce-App-Micro-Services-Spring-Angular/blob/main/pics/01.1png.png">
<ul dir="auto">
<li><strong>Consul</strong> is reactive : means that if it is rebooted, the services detect it and register automatically</li>
</ul>
<h3 dir="auto"><a id="user-content-22-configuration-service" class="anchor" aria-hidden="true" href="#22-configuration-service"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>2.2. <a name="user-content-configurationservice"></a>Configurations and Dependencies of Micro-Services</h3>
<h4 dir="auto"><a id="user-content-221-config-service-dependencies" class="anchor" aria-hidden="true" href="#221-config-service-dependencies"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>2.2.1. <a name="user-content-configservicedependencies"></a>Config service</h4>

  <ul dir="auto">
<li>Dependencies</strong>.</li>
</ul>

<div class="snippet-clipboard-content notranslate position-relative overflow-auto"><pre class="notranslate"><code>- Config Server
- Spring boot Actuator
- Consul Discovery
</code></pre><div class="zeroclipboard-container position-absolute right-0 top-0">
    <clipboard-copy aria-label="Copy" class="ClipboardButton btn js-clipboard-copy m-2 p-0 tooltipped-no-delay" data-copy-feedback="Copied!" data-tooltip-direction="w" value="- Config Server
- Spring boot Actuator
- Consul Discovery" tabindex="0" role="button">
      <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-copy js-clipboard-copy-icon m-2">
    <path fill-rule="evenodd" d="M0 6.75C0 5.784.784 5 1.75 5h1.5a.75.75 0 010 1.5h-1.5a.25.25 0 00-.25.25v7.5c0 .138.112.25.25.25h7.5a.25.25 0 00.25-.25v-1.5a.75.75 0 011.5 0v1.5A1.75 1.75 0 019.25 16h-7.5A1.75 1.75 0 010 14.25v-7.5z"></path><path fill-rule="evenodd" d="M5 1.75C5 .784 5.784 0 6.75 0h7.5C15.216 0 16 .784 16 1.75v7.5A1.75 1.75 0 0114.25 11h-7.5A1.75 1.75 0 015 9.25v-7.5zm1.75-.25a.25.25 0 00-.25.25v7.5c0 .138.112.25.25.25h7.5a.25.25 0 00.25-.25v-7.5a.25.25 0 00-.25-.25h-7.5z"></path>
</svg>
      <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-check js-clipboard-check-icon color-fg-success d-none m-2">
    <path fill-rule="evenodd" d="M13.78 4.22a.75.75 0 010 1.06l-7.25 7.25a.75.75 0 01-1.06 0L2.22 9.28a.75.75 0 011.06-1.06L6 10.94l6.72-6.72a.75.75 0 011.06 0z"></path>
</svg>
    </clipboard-copy>
  </div></div>
  
  <ul dir="auto">
<li>Properties</strong>.</li>
</ul>

<pre><span class="pl-k">server.port</span>=8888
<span class="pl-k">spring.application.name</span>=config-service
<span class="pl-k">spring.cloud.config.server.git.uri</span>==file:///C:/Users/Tarik/Desktop/Tarik/ENSET/S5/youssfi/Spring-Micro-Services-Consul-Config Gateway-Feign-Resilience4J/microservices-consul-config/config-repo // from where getting the config (repo local)</pre>





  
  <h4 dir="auto"><a id="user-content-231-gateway-service-dependencies" class="anchor" aria-hidden="true" href="#231-gateway-service-dependencies"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>2.2.2. <a name="user-content-gatewayservicedependencies"></a>Gateway service</h4>
   <ul dir="auto">
<li>Dependencies</strong>.</li>
</ul>
  <div class="snippet-clipboard-content notranslate position-relative overflow-auto"><pre class="notranslate"><code>- Spring Cloud Gateway
- Consul Discovery : to register in the dicovery service
- Spring boot Actuator
- Spring cloud Config
</code></pre><div class="zeroclipboard-container position-absolute right-0 top-0">
    <clipboard-copy aria-label="Copy" class="ClipboardButton btn js-clipboard-copy m-2 p-0 tooltipped-no-delay" data-copy-feedback="Copied!" data-tooltip-direction="w" value="- Spring Cloud Gateway
- Consul Discovery : to register in the dicovery service
- Spring boot Actuator
- Spring cloud Config" tabindex="0" role="button">
      <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-copy js-clipboard-copy-icon m-2">
    <path fill-rule="evenodd" d="M0 6.75C0 5.784.784 5 1.75 5h1.5a.75.75 0 010 1.5h-1.5a.25.25 0 00-.25.25v7.5c0 .138.112.25.25.25h7.5a.25.25 0 00.25-.25v-1.5a.75.75 0 011.5 0v1.5A1.75 1.75 0 019.25 16h-7.5A1.75 1.75 0 010 14.25v-7.5z"></path><path fill-rule="evenodd" d="M5 1.75C5 .784 5.784 0 6.75 0h7.5C15.216 0 16 .784 16 1.75v7.5A1.75 1.75 0 0114.25 11h-7.5A1.75 1.75 0 015 9.25v-7.5zm1.75-.25a.25.25 0 00-.25.25v7.5c0 .138.112.25.25.25h7.5a.25.25 0 00.25-.25v-7.5a.25.25 0 00-.25-.25h-7.5z"></path>
</svg>
      <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-check js-clipboard-check-icon color-fg-success d-none m-2">
    <path fill-rule="evenodd" d="M13.78 4.22a.75.75 0 010 1.06l-7.25 7.25a.75.75 0 01-1.06 0L2.22 9.28a.75.75 0 011.06-1.06L6 10.94l6.72-6.72a.75.75 0 011.06 0z"></path>
</svg>
    </clipboard-copy>
  </div></div>
  
<ul dir="auto">
<li>Properties</strong>.</li>
</ul>

<pre><span class="pl-k">server.port</span>=9999
<span class="pl-k">spring.application.name</span>=gateway-service
<span class="pl-k">spring.config.import</span>=optional:configserver:http://localhost:8888</pre>
  
  <h4 dir="auto"><a id="user-content-311-customer-service-dependencies" class="anchor" aria-hidden="true" href="#311-customer-service-dependencies"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>2.2.3. <a name="user-content-customerservicedependencies"></a>Customer service</h4>
   <ul dir="auto">
<li>Dependencies</strong>.</li>
</ul> 
<pre class="notranslate"><code>- Spring Web
- Spring Data Jpa
- H2 Database
- Lombok
- Rest Repositories
- Consul Discovery : to register in the dicovery service
- Config client : to find its configuration
- Spring boot Actuator
</code></pre>

  <ul dir="auto">
<li>Properties</strong>.</li>
</ul>

<pre><span class="pl-k">server.port</span>=8081
<span class="pl-k">spring.application.name</span>=customer-service
<span class="pl-k">spring.config.import</span>=optional:configserver:http://localhost:8888</pre>


  <h4 dir="auto"><a id="user-content-321-inventory-service-dependencies" class="anchor" aria-hidden="true" href="#321-inventory-service-dependencies"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>2.2.4. <a name="user-content-inventoryservicedependencies"></a>Inventory service</h4>
<ul dir="auto">
<li>Dependencies</strong>.</li>
</ul>

<pre class="notranslate"><code>- Spring Web
- Spring Data Jpa
- H2 Database
- Lombok
- Rest Repositories
- Consul Discovery : to register in the dicovery service
- Config client : to find its configuration
- Spring boot Actuator
</code></pre>

 <ul dir="auto">
<li>Properties</strong>.</li>
</ul>

<pre><span class="pl-k">server.port</span>=8082
<span class="pl-k">spring.application.name</span>=inventory-service
<span class="pl-k">spring.config.import</span>=optional:configserver:http://localhost:8888</pre>


  <h4 dir="auto"><a id="user-content-331-order-service-dependencies" class="anchor" aria-hidden="true" href="#331-order-service-dependencies"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>2.2.5. <a name="user-content-orderservicedependencies"></a>Order service</h4>
<ul dir="auto">
<li>Dependencies</strong>.</li>
</ul> 
<pre class="notranslate"><code>- Spring Web
- Spring Data Jpa
- H2 Database
- Lombok
- Rest Repositories
- Consul Discovery : to register in the dicovery service
- Config client : to find its configuration
- Spring boot Actuator
</code></pre>

<ul dir="auto">
<li>Properties</strong>.</li>
</ul>

<pre><span class="pl-k">server.port</span>=8083
<span class="pl-k">spring.application.name</span>=order-service
<span class="pl-k">spring.config.import</span>=optional:configserver:http://localhost:8888</pre>


<h4 dir="auto"><a id="user-content-331-order-service-dependencies" class="anchor" aria-hidden="true" href="#331-order-service-dependencies"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>2.2.6. <a name="user-content-orderservicedependencies"></a>Billing service</h4>
<ul dir="auto">
<li>Dependencies</strong>.</li>
</ul> 
<pre class="notranslate"><code>- Spring Web
- Spring Web
- Consul Discovery
- Lombok
- Consul Configuration
- Spring Boot Actuator
- Vault Configuration
</code></pre>

<ul dir="auto">
<li>Properties</strong>.</li>
</ul>

<pre><span class="pl-k">server.port</span>=8084
<span class="pl-k">spring.application.name</span>=billing-service
<span class="pl-k">spring.config.import</span>=optional:consul:, vault://</pre>
<!--<span class="pl-k">spring.cloud.vault.scheme</span>=true</pre>
<span class="pl-k">management.endpoints.web.exposure.include</span>=*</pre>
<span class="pl-k">spring.cloud.vault.token</span>=hvs.LCYl8Y3goKq2AoaKZIl0ClhV</pre>-->



<h3 dir="auto"><a id="user-content-34-consul-what-is-happening-" class="anchor" aria-hidden="true" href="#34-consul-what-is-happening-"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>2.3. <a name="user-content-consulwhatishappening"></a>Consul</h3>
<ul dir="auto">
<li>Everything is working fine after running all services.</li>
</ul>
<img src="https://github.com/TarikFERTAHI/E-commerce-App-Micro-Services-Spring-Angular/blob/main/pics/02.png">
<h3 dir="auto"><a id="user-content-34-consul-what-is-happening-" class="anchor" aria-hidden="true" href="#34-consul-what-is-happening-"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>2.4. <a name="user-content-consulwhatishappening"></a>Tests</h3>
<h4 dir="auto"><a id="user-content-337-order-service-creating-a-rest-controller" class="anchor" aria-hidden="true" href="#337-order-service-creating-a-rest-controller"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>2.4.1. <a name="user-content-orderservicecreatingarestcontroller"></a>customer-service Tests</h4>
<ul dir="auto">
<li>Adding some customers in database h2</strong>.</li>
</ul>
<img src="https://github.com/TarikFERTAHI/E-commerce-App-Micro-Services-Spring-Angular/blob/main/pics/04.png">

<ul dir="auto">
<li>Testing , visiting : <code>http://localhost:9999/gateway-service/customer-service/customers</code></li>
</ul>
<img src="https://github.com/TarikFERTAHI/E-commerce-App-Micro-Services-Spring-Angular/blob/main/pics/gateway-customer.png">
<h4 dir="auto"><a id="user-content-337-order-service-creating-a-rest-controller" class="anchor" aria-hidden="true" href="#337-order-service-creating-a-rest-controller"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>2.4.2. <a name="user-content-orderservicecreatingarestcontroller"></a>inventory-service Tests</h4>
<ul dir="auto">
<li>Adding some products in database h2</strong>.</li>
</ul>
<img src="https://github.com/TarikFERTAHI/E-commerce-App-Micro-Services-Spring-Angular/blob/main/pics/05.png">
<ul dir="auto">
<li>Testing with projections , visiting : <code>http://localhost:9999/gateway-service/inventory-service/products/1?projection=fullProduct</code></li>
</ul>
<img src="https://github.com/TarikFERTAHI/E-commerce-App-Micro-Services-Spring-Angular/blob/main/pics/gateway-inv-projection.png">

<h4 dir="auto"><a id="user-content-337-order-service-creating-a-rest-controller" class="anchor" aria-hidden="true" href="#337-order-service-creating-a-rest-controller"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>2.4.3. <a name="user-content-orderservicecreatingarestcontroller"></a>order service Tests</h4>
<ul dir="auto">
<li>Adding some orders in database h2</strong>.</li>
</ul>
<img src="https://github.com/TarikFERTAHI/E-commerce-App-Micro-Services-Spring-Angular/blob/main/pics/07.png">

<ul dir="auto">
<li>Testing , visiting : <code>http://localhost:9999/gateway-service/order-service/orders</code></li>
</ul>
<img src="https://github.com/TarikFERTAHI/E-commerce-App-Micro-Services-Spring-Angular/blob/main/pics/gateway-order.png">
<ul dir="auto">
<li>For Testing all Mirco-services are working, visiting : <code>http://localhost:9999/gateway-service/order-service/fullOrder/2</code></li>
</ul>
<img src="https://github.com/TarikFERTAHI/E-commerce-App-Micro-Services-Spring-Angular/blob/main/pics/gatewayfullOrder.png">
<h3 dir="auto"><a id="user-content-34-consul-what-is-happening-" class="anchor" aria-hidden="true" href="#34-consul-what-is-happening-"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>2.4. <a name="user-content-consulwhatishappening"></a>Vault</h3>
<ul dir="auto">
<li><p dir="auto">Website : <a href="https://www.vaultproject.io/" rel="nofollow">https://www.consul.io/</a></p>
</ul> 
<ul dir="auto">
<li>Command to Run Vault :<code>vault server -dev</code>
</ul>
<ul dir="auto">
<li>Create Key/Value from CMD
</ul>
<img src="https://github.com/TarikFERTAHI/E-commerce-App-Micro-Services-Spring-Angular/blob/main/pics/vaultKeyValueCmd.png">
<ul dir="auto">
<li>Visiting :<code>http://127.0.0.1:8200/ui/vault/secrets/secret/show/billing-service</code>
</ul>
<img src="https://github.com/TarikFERTAHI/E-commerce-App-Micro-Services-Spring-Angular/blob/main/pics/vaultKVInter.png">
<h1>II. Frontend</h1>
<h4><li>Products list</li></h4>
<img src="https://github.com/TarikFERTAHI/E-commerce-App-Micro-Services-Spring-Angular/blob/main/pics/front1.png">
<h4><li>Customers</li></h4>
<img src="https://github.com/TarikFERTAHI/E-commerce-App-Micro-Services-Spring-Angular/blob/main/pics/front2.png">
<h4><li>Customer Orders</li></h4>
<img src="https://github.com/TarikFERTAHI/E-commerce-App-Micro-Services-Spring-Angular/blob/main/pics/front3.png">
<h4><li>Orders details</li></h4>
<img src="https://github.com/TarikFERTAHI/E-commerce-App-Micro-Services-Spring-Angular/blob/main/pics/front4.png">
<h1>III. Security</h1>
<ul dir="auto">
<li>Basic AUth testing with postman</strong>.</li>
</ul>
<img src="https://github.com/TarikFERTAHI/E-commerce-App-Micro-Services-Spring-Angular/blob/main/pics/basicAuth.png">

<ul dir="auto">
<li>Openssl : keypair </strong>.</li>
</ul>
<code>openssl genrsa -out keypair.pem 2048</code>
<ul dir="auto">
<li>Openssl : public key </strong>.</li>
</ul>
<code>openssl rsa -in keypair.pem -pubout -out public.pem</code>
<ul dir="auto">
<li>Openssl : private key with pkcs8</strong>.</li>
</ul>
<code>openssl pkcs8 -topk8 -inform PEM -nocrypt -in keypair.pem -out private.pem</code>
<br>
<br>
<img src="https://github.com/TarikFERTAHI/E-commerce-App-Micro-Services-Spring-Angular/blob/main/pics/keys.png">
<br>
<img src="https://github.com/TarikFERTAHI/E-commerce-App-Micro-Services-Spring-Angular/blob/main/pics/accessToken.png">
<br>
<img src="https://github.com/TarikFERTAHI/E-commerce-App-Micro-Services-Spring-Angular/blob/main/pics/tokenInfos.png">

