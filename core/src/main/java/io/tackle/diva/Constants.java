/*
Copyright IBM Corporation 2021

Licensed under the Apache Public License 2.0, Version 2.0 (the "License");
you may not use this file except in compliance with the License.

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */

package io.tackle.diva;

import com.ibm.wala.types.TypeName;
import com.ibm.wala.util.strings.Atom;

public interface Constants {

    Atom theInit = Atom.findOrCreateUnicodeAtom("<init>");
    Atom theClinit = Atom.findOrCreateUnicodeAtom("<clinit>");
    Atom Java = Atom.findOrCreateUnicodeAtom("Java");

    Atom getParameter = Atom.findOrCreateUnicodeAtom("getParameter");
    Atom prepareStatement = Atom.findOrCreateUnicodeAtom("prepareStatement");
    Atom prepareCall = Atom.findOrCreateUnicodeAtom("prepareCall");
    Atom executeQuery = Atom.findOrCreateUnicodeAtom("executeQuery");
    Atom executeUpdate = Atom.findOrCreateUnicodeAtom("executeUpdate");

    Atom commit = Atom.findOrCreateUnicodeAtom("commit");
    Atom rollback = Atom.findOrCreateUnicodeAtom("rollback");

    Atom doGet = Atom.findOrCreateUnicodeAtom("doGet");
    Atom doPost = Atom.findOrCreateUnicodeAtom("doPost");
    Atom doDelete = Atom.findOrCreateUnicodeAtom("doDelete");
    Atom doPut = Atom.findOrCreateUnicodeAtom("doPut");
    Atom doFilter = Atom.findOrCreateUnicodeAtom("doFilter");
    Atom process = Atom.findOrCreateUnicodeAtom("process");
    Atom init = Atom.findOrCreateUnicodeAtom("init");
    Atom service = Atom.findOrCreateUnicodeAtom("service");

    Atom queryForObject = Atom.findOrCreateUnicodeAtom("queryForObject");
    Atom update = Atom.findOrCreateUnicodeAtom("update");
    Atom executeAndReturnKey = Atom.findOrCreateUnicodeAtom("executeAndReturnKey");
    Atom execute = Atom.findOrCreateUnicodeAtom("execute");
    Atom withTableName = Atom.findOrCreateUnicodeAtom("withTableName");
    Atom usingGeneratedKeyColumns = Atom.findOrCreateUnicodeAtom("usingGeneratedKeyColumns");

    Atom find = Atom.findOrCreateUnicodeAtom("find");
    Atom findById = Atom.findOrCreateUnicodeAtom("findById");
    Atom findAll = Atom.findOrCreateUnicodeAtom("findAll");
    Atom findAllById = Atom.findOrCreateUnicodeAtom("findAllById");
    Atom getOne = Atom.findOrCreateUnicodeAtom("getOne");
    Atom getById = Atom.findOrCreateUnicodeAtom("getById");
    Atom existsById = Atom.findOrCreateUnicodeAtom("existsById");
    Atom delete = Atom.findOrCreateUnicodeAtom("delete");
    Atom deleteAll = Atom.findOrCreateUnicodeAtom("deleteAll");
    Atom deleteById = Atom.findOrCreateUnicodeAtom("deleteById");
    Atom save = Atom.findOrCreateUnicodeAtom("save");
    Atom saveAndFlush = Atom.findOrCreateUnicodeAtom("saveAndFlush");

    Atom createQuery = Atom.findOrCreateUnicodeAtom("createQuery");

    Atom toString = Atom.findOrCreateUnicodeAtom("toString");
    Atom append = Atom.findOrCreateUnicodeAtom("append");
    Atom trim = Atom.findOrCreateUnicodeAtom("trim");
    Atom strip = Atom.findOrCreateUnicodeAtom("strip");
    Atom toUpperCase = Atom.findOrCreateUnicodeAtom("toUpperCase");
    Atom toLowerCase = Atom.findOrCreateUnicodeAtom("toLowerCase");
    Atom replaceAll = Atom.findOrCreateUnicodeAtom("replaceAll");

    Atom equals = Atom.findOrCreateUnicodeAtom("equals");
    Atom equalsIgnoreCase = Atom.findOrCreateUnicodeAtom("equalsIgnoreCase");
    Atom contains = Atom.findOrCreateUnicodeAtom("contains");

    Atom intValue = Atom.findOrCreateUnicodeAtom("intValue");
    Atom longValue = Atom.findOrCreateUnicodeAtom("longValue");
    Atom floatValue = Atom.findOrCreateUnicodeAtom("floatValue");
    Atom doubleValue = Atom.findOrCreateUnicodeAtom("doubleValue");

    Atom setString = Atom.findOrCreateUnicodeAtom("setString");
    Atom setInt = Atom.findOrCreateUnicodeAtom("setInt");
    Atom setBigDecimal = Atom.findOrCreateUnicodeAtom("setBigDecimal");
    Atom setFloat = Atom.findOrCreateUnicodeAtom("setFloat");
    Atom setDouble = Atom.findOrCreateUnicodeAtom("setDouble");
    Atom setTimestamp = Atom.findOrCreateUnicodeAtom("setTimestamp");

    Atom getString = Atom.findOrCreateUnicodeAtom("getString");
    Atom getInt = Atom.findOrCreateUnicodeAtom("getInt");
    Atom getBigDecimal = Atom.findOrCreateUnicodeAtom("getBigDecimal");
    Atom getFloat = Atom.findOrCreateUnicodeAtom("getFloat");
    Atom getDouble = Atom.findOrCreateUnicodeAtom("getDouble");
    Atom getTimestamp = Atom.findOrCreateUnicodeAtom("getTimestamp");

    Atom get = Atom.findOrCreateUnicodeAtom("get");
    Atom getProperty = Atom.findOrCreateUnicodeAtom("getProperty");

    Atom next = Atom.findOrCreateUnicodeAtom("next");
    Atom iterator = Atom.findOrCreateUnicodeAtom("iterator");
    Atom add = Atom.findOrCreateUnicodeAtom("add");
    Atom addAll = Atom.findOrCreateUnicodeAtom("addAll");

    Atom newInstance = Atom.findOrCreateUnicodeAtom("newInstance");
    Atom forName = Atom.findOrCreateUnicodeAtom("forName");
    Atom loadClass = Atom.findOrCreateUnicodeAtom("loadClass");

    Atom include = Atom.findOrCreateUnicodeAtom("include");
    Atom forward = Atom.findOrCreateUnicodeAtom("forward");
    Atom setAttribute = Atom.findOrCreateUnicodeAtom("setAttribute");

    Atom getReference = Atom.findOrCreateUnicodeAtom("getReference");

    TypeName LUnknown = TypeName.findOrCreate("Lunknown/Unknown");
    TypeName LJavaLangObject = TypeName.findOrCreate("Ljava/lang/Object");
    TypeName LJavaLangClass = TypeName.findOrCreate("Ljava/lang/Class");
    TypeName LJavaLangClassLoader = TypeName.findOrCreate("Ljava/lang/ClassLoader");

    TypeName LJavaLangInteger = TypeName.findOrCreate("Ljava/lang/Integer");
    TypeName LJavaLangLong = TypeName.findOrCreate("Ljava/lang/Long");
    TypeName LJavaLangFloat = TypeName.findOrCreate("Ljava/lang/Float");
    TypeName LJavaLangDouble = TypeName.findOrCreate("Ljava/lang/Double");
    TypeName LJavaMathBigDecimal = TypeName.findOrCreate("Ljava/math/BigDecimal");

    TypeName LJavaLangString = TypeName.findOrCreate("Ljava/lang/String");
    TypeName LJavaLangStringBuffer = TypeName.findOrCreate("Ljava/lang/StringBuffer");
    TypeName LJavaLangStringBuilder = TypeName.findOrCreate("Ljava/lang/StringBuilder");

    TypeName LJavaUtilList = TypeName.findOrCreate("Ljava/util/List");
    TypeName LJavaUtilHashtable = TypeName.findOrCreate("Ljava/util/Hashtable");
    TypeName LJavaUtilHashMap = TypeName.findOrCreate("Ljava/util/HashMap");
    TypeName LJavaUtilProperties = TypeName.findOrCreate("Ljava/util/Properties");

    TypeName JavaUtilIterator = TypeName.findOrCreate("Ljava/util/Iterator");


    // JDBC
    TypeName LJavaSqlConnection = TypeName.findOrCreate("Ljava/sql/Connection");
    TypeName LJavaSqlStatement = TypeName.findOrCreate("Ljava/sql/Statement");
    TypeName LJavaSqlPreparedStatement = TypeName.findOrCreate("Ljava/sql/PreparedStatement");
    TypeName LJavaSqlCallableStatement = TypeName.findOrCreate("Ljava/sql/CallableStatement");
    TypeName LJavaSqlResultSet = TypeName.findOrCreate("Ljava/sql/ResultSet");

    // Spring
    TypeName LSpringJdbcTemplate = TypeName.findOrCreate("Lorg/springframework/jdbc/core/JdbcTemplate");
    TypeName LSpringSimpleJdbcInsert = TypeName.findOrCreate("Lorg/springframework/jdbc/core/simple/SimpleJdbcInsert");
    TypeName LSpringTransactional = TypeName.findOrCreate("Lorg/springframework/transaction/annotation/Transactional");
    TypeName LSpringAutowired = TypeName.findOrCreate("Lorg/springframework/beans/factory/annotation/Autowired");
    TypeName LSpringBeanSource = TypeName
            .findOrCreate("Lorg/springframework/jdbc/core/namedparam/BeanPropertySqlParameterSource");
    TypeName LSpringController = TypeName.findOrCreate("Lorg/springframework/stereotype/Controller");
    TypeName LSpringRestController = TypeName.findOrCreate("Lorg/springframework/web/bind/annotation/RestController");
    TypeName LSpringScheduled = TypeName.findOrCreate("Lorg/springframework/scheduling/annotation/Scheduled");

    TypeName LSpringRequestBody = TypeName.findOrCreate("Lorg/springframework/web/bind/annotation/RequestBody");

    TypeName LSpringNamedJdbcTemplate = TypeName.findOrCreate("Lorg/springframework/jdbc/core/namedparam/NamedParameterJdbcTemplate");

    TypeName LJavaxInject = TypeName.findOrCreate("Ljavax/inject/Inject");

    // Servlet
    TypeName LJavaxWebServlet = TypeName.findOrCreate("Ljavax/servlet/annotation/WebServlet");
    TypeName LJavaxWebFilter = TypeName.findOrCreate("Ljavax/servlet/annotation/WebFilter");
    TypeName LJavaxHttpServlet = TypeName.findOrCreate("Ljavax/servlet/http/HttpServlet");
    TypeName LJavaxHttpServletRequest = TypeName.findOrCreate("Ljavax/servlet/http/HttpServletRequest");

    TypeName LJavaxServletContext = TypeName.findOrCreate("Ljavax/servlet/ServletContext");
    TypeName LJavaxRequestDispatcher = TypeName.findOrCreate("Ljavax/servlet/RequestDispatcher");

    // JPA
    TypeName LJavaxPersistenceCascadeType = TypeName.findOrCreate("Ljavax/persistence/CascadeType");
    TypeName LJavaxPersistenceColumn = TypeName.findOrCreate("Ljavax/persistence/Column");
    TypeName LJavaxPersistenceEmbedded = TypeName.findOrCreate("Ljavax/persistence/Embedded");
    TypeName LJavaxPersistenceEntity = TypeName.findOrCreate("Ljavax/persistence/Entity");
    TypeName LJavaxPersistenceEntityListeners = TypeName.findOrCreate("Ljavax/persistence/EntityListeners");
    TypeName LJavaxPersistenceFetchType = TypeName.findOrCreate("Ljavax/persistence/FetchType");
    TypeName LJavaxPersistenceGeneratedValue = TypeName.findOrCreate("Ljavax/persistence/GeneratedValue");
    TypeName LJavaxPersistenceGenerationType = TypeName.findOrCreate("Ljavax/persistence/GenerationType");
    TypeName LJavaxPersistenceId = TypeName.findOrCreate("Ljavax/persistence/Id");
    TypeName LJavaxPersistenceJoinColumn = TypeName.findOrCreate("Ljavax/persistence/JoinColumn");
    TypeName LJavaxPersistenceManyToOne = TypeName.findOrCreate("Ljavax/persistence/ManyToOne");
    TypeName LJavaxPersistenceOneToMany = TypeName.findOrCreate("Ljavax/persistence/OneToMany");
    TypeName LJavaxPersistenceTable = TypeName.findOrCreate("Ljavax/persistence/Table");
    TypeName LJavaxPersistenceTableGenerator = TypeName.findOrCreate("Ljavax/persistence/TableGenerator");
    TypeName LJavaxPersistenceUniqueConstraint = TypeName.findOrCreate("Ljavax/persistence/UniqueConstraint");

    TypeName LJavaxPersistenceEntityManager = TypeName.findOrCreate("Ljavax/persistence/EntityManager");
    TypeName LJavaxPersistenceQuery = TypeName.findOrCreate("Ljavax/persistence/QUery");

    TypeName LJakartaPersistenceEntityManager = TypeName.findOrCreate("Ljakarta/persistence/EntityManager");

    TypeName LSpringRepository = TypeName.findOrCreate("Lorg/springframework/data/repository/Repository");
    TypeName LSpringJPARepository = TypeName.findOrCreate("Lorg/springframework/data/jpa/repository/JpaRepository");
    TypeName LSpringJPAQuery = TypeName.findOrCreate("Lorg/springframework/data/jpa/repository/Query");

    // JAX-RS
    TypeName LJavaxWsRsGET = TypeName.findOrCreate("Ljavax/ws/rs/GET");
    TypeName LJavaxWsRsPUT = TypeName.findOrCreate("Ljavax/ws/rs/PUT");
    TypeName LJavaxWsRsPOST = TypeName.findOrCreate("Ljavax/ws/rs/POST");
    TypeName LJavaxWsRsPATCH = TypeName.findOrCreate("Ljavax/ws/rs/PATCH");
    TypeName LJavaxWsRsDELETE = TypeName.findOrCreate("Ljavax/ws/rs/DELETE");
    TypeName LJavaxWsRsPath = TypeName.findOrCreate("Ljavax/ws/rs/Path");
    TypeName LJavaxWsRsPathParam = TypeName.findOrCreate("Ljavax/ws/rs/PathParam");
    TypeName LJavaxWsRsQueryParam = TypeName.findOrCreate("Ljavax/ws/rs/QueryParam");

    // RestEasy
    TypeName LMicroprofileReigsterRestClient = TypeName
            .findOrCreate("Lorg/eclipse/microprofile/rest/client/inject/RegisterRestClient");

    //SPI
    TypeName LSpiBeanManager = TypeName.findOrCreate("Ljavax/enterprise/inject/spi/BeanManager");

    // Struts
    TypeName LStrutsAction = TypeName.findOrCreate("Lorg/apache/struts/action/Action");
    TypeName LStrutsActionForm = TypeName.findOrCreate("Lorg/apache/struts/action/ActionForm");
    TypeName LStrutsValidatorForm = TypeName.findOrCreate("Lorg/apache/struts/validator/ValidatorForm");

}
