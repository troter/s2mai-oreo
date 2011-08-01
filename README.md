S2Mai用のおれおれ拡張
===========================================

pom.xmlに追記する設定
---------------------

**mavenリポジトリを追加**

    <repositories>
      <repository>
        <id>troter.jp/release</id>
        <name>TROTER.JP Release Maven2 Repository</name>
        <url>http://troter.jp/maven2/release</url>
      </repository>
    </repositories>

**依存関係を追加**

    <dependencies>
      <dependency>
        <groupId>jp.troter</groupId>
        <artifactId>s2mai-oreo</artifactId>
        <version>0.1.1</version>
      </dependency>
    </dependencies>
